import java.util.ArrayList;
import java.util.List;

/**
 * Aula 05 · Atividade: o Banco da aula 04 ganha um Notificador (interface) e a transferência (exceção).
 */
public class Banco {
    private String nome;
    private List<ContaBancaria> contas = new ArrayList<>();
    private Notificador notificador; // o banco não sabe se é e-mail ou SMS: só conhece o contrato

    public Banco(String nome, Notificador notificador) {
        this.nome = nome;
        this.notificador = notificador;
    }

    public String getNome() {
        return nome;
    }

    public void abrirConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void fecharMes() {
        for (ContaBancaria c : contas) {
            c.fecharMes();
        }
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) throws SaldoInsuficienteException {
        origem.sacar(valor); // se lançar exceção, as linhas de baixo não rodam
        destino.depositar(valor);
        notificador.enviar(origem.getTitular(), "Enviou R$ " + valor + " a " + destino.getTitular() + ".");
        notificador.enviar(destino.getTitular(), "Recebeu R$ " + valor + " de " + origem.getTitular() + ".");
    }
}
