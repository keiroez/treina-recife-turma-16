/**
 * Aula 03 · Lab 1 (extends + super) e Lab 2 (sobrescrita).
 */
public class Estagiario extends Funcionario {
    private int horasSemanais;

    public Estagiario(String nome, double salarioBase, int horasSemanais) {
        super(nome, salarioBase);
        this.horasSemanais = horasSemanais;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    // Lab 2: proporcional às horas (o salário base é para 40h por semana)
    @Override
    public double calcularSalario() {
        return getSalarioBase() * horasSemanais / 40;
    }
}
