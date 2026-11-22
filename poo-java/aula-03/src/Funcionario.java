/**
 * Aula 03 · Labs 1 e 2: a superclasse dos funcionários.
 */
public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    // mostrar() chama calcularSalario(): se a subclasse sobrescrever, o valor muda aqui também
    public void mostrar() {
        System.out.println(nome + " · R$ " + calcularSalario());
    }
}
