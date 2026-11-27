import java.util.ArrayList;
import java.util.List;

/**
 * Aula 05 · Interfaces e Exceptions, do começo ao fim no banco das aulas 01 a 04.
 * Rode este arquivo (botão ▶ ao lado do main) e compare com os slides.
 */
public class Main {
    public static void main(String[] args) {
        // bloco 1 (live coding): o banco avisa o cliente por vários canais
        List<Notificador> canais = new ArrayList<>();
        canais.add(new NotificadorEmail());
        canais.add(new NotificadorSms());
        for (Notificador n : canais) {
            n.enviar("Ana", "Saque de R$ 50.0 na sua conta.");
        }

        // lab 1: formas de pagamento do app do banco
        System.out.println("--- pagamentos ---");
        CartaoCredito cartao = new CartaoCredito(200);
        System.out.println("pagou 120: " + cartao.pagar(120));
        System.out.println("pagou 150: " + cartao.pagar(150)); // só restam 80 de limite
        // bônus: as três formas na mesma lista
        List<FormaPagamento> formas = new ArrayList<>();
        formas.add(new Pix());
        formas.add(new Boleto());
        formas.add(cartao);
        for (FormaPagamento f : formas) {
            System.out.println(f.getNome() + " pagou 50: " + f.pagar(50));
        }

        // bloco 2: uma exceção do próprio Java, tratada (o valor digitado no caixa vem como texto)
        System.out.println("--- exceções ---");
        try {
            int valor = Integer.parseInt("cem");
            System.out.println("Valor: " + valor); // não chega aqui
        } catch (NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // lab 2: exceções na ContaBancaria
        ContaBancaria ana = new ContaDigital("Ana", 100);
        try {
            ana.sacar(30);
            ana.sacar(500);
            System.out.println("Não chega aqui.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo: " + ana.getSaldo());
        try {
            ana.depositar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // bônus do lab 2: a corrente também lança
        try {
            new ContaCorrente("Bruno", 100, 100).sacar(250);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // atividade: transferência
        System.out.println("--- transferência ---");
        Banco banco = new Banco("Banco Treina", new NotificadorSms());
        ContaBancaria origem = new ContaDigital("Ana", 100);
        ContaBancaria destino = new ContaPoupanca("Bruno", 1000, 0.01);
        banco.abrirConta(origem);
        banco.abrirConta(destino);
        transferir(banco, origem, destino, 80);
        transferir(banco, origem, destino, 80); // a Ana só tem 20 agora
    }

    private static void transferir(Banco banco, ContaBancaria origem, ContaBancaria destino, double valor) {
        try {
            banco.transferir(origem, destino, valor);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Recusada: " + e.getMessage());
        } finally {
            // roda sempre, com ou sem erro
            System.out.println(origem.getTitular() + ": R$ " + origem.getSaldo() + " · " + destino.getTitular() + ": R$ " + destino.getSaldo());
        }
    }
}
