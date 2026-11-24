import java.util.ArrayList;
import java.util.List;

/**
 * Aula 04 · Polimorfismo e abstração, do começo ao fim com as contas do banco.
 * Rode este arquivo (botão ▶ ao lado do main) e compare com os slides.
 *
 * Aqui a ContaBancaria já está abstrata (fim da aula). Nos slides do bloco 1 a Carla
 * ainda tem uma ContaBancaria "comum"; aqui ela já tem a ContaDigital do lab 2.
 */
public class Main {
    public static void main(String[] args) {
        // bloco 1 (live coding): contas de tipos diferentes na mesma lista
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaCorrente("Ana", 100, 100));
        contas.add(new ContaPoupanca("Bruno", 100, 0.01));
        contas.add(new ContaDigital("Carla", 300));
        for (ContaBancaria c : contas) {
            // a mesma chamada; cada conta usa a SUA regra de saque
            System.out.println(c.getTitular() + " sacou 150: " + c.sacar(150));
        }

        // labs 1 e 2: fechamento do mês
        System.out.println("--- fechamento do mês ---");
        contas = new ArrayList<>();
        contas.add(new ContaCorrente("Ana", 100, 100));
        contas.add(new ContaPoupanca("Bruno", 100, 0.01));
        contas.add(new ContaDigital("Carla", 300));
        contas.add(new ContaDigital("Davi", 800));
        double total = 0;
        for (ContaBancaria c : contas) {
            c.fecharMes();
            c.mostrar();
            total += c.getSaldo();
        }
        System.out.println("Total no banco: R$ " + total);

        // atividade: o banco
        System.out.println("--- banco ---");
        Banco banco = new Banco("Banco Treina");
        ContaCorrente ana = new ContaCorrente("Ana", 100, 100);
        banco.abrirConta(ana);
        banco.abrirConta(new ContaPoupanca("Bruno", 1000, 0.01));
        banco.abrirConta(new ContaDigital("Carla", 300));
        banco.abrirConta(new ContaDigital("Davi", 800));
        ana.sacar(150); // Ana fica com -50
        banco.fecharMes();
        banco.mostrarTodas();
        System.out.println("Total guardado: R$ " + banco.totalGuardado());
        System.out.print("No negativo:");
        for (ContaBancaria c : banco.contasNoNegativo()) {
            System.out.print(" " + c.getTitular());
        }
        System.out.println();
    }
}
