import java.util.ArrayList;
import java.util.List;

/**
 * Aula 04 · Atividade em dupla: o banco TEM VÁRIAS contas.
 * Os quatro pilares juntos: a lista é private (encapsulamento), as contas são de tipos
 * diferentes (herança), cada uma fecha o mês do seu jeito (polimorfismo) e
 * ContaBancaria não ganha new (abstração).
 */
public class Banco {
    private String nome;
    private List<ContaBancaria> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void abrirConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void mostrarTodas() {
        for (ContaBancaria c : contas) {
            c.mostrar();
        }
    }

    // um for, vários comportamentos: cada conta fecha o mês do seu jeito
    public void fecharMes() {
        for (ContaBancaria c : contas) {
            c.fecharMes();
        }
    }

    public double totalGuardado() {
        double total = 0;
        for (ContaBancaria c : contas) {
            total += c.getSaldo();
        }
        return total;
    }

    // filtrar é montar uma lista nova só com quem passa no if
    public List<ContaBancaria> contasNoNegativo() {
        List<ContaBancaria> negativas = new ArrayList<>();
        for (ContaBancaria c : contas) {
            if (c.getSaldo() < 0) {
                negativas.add(c);
            }
        }
        return negativas;
    }
}
