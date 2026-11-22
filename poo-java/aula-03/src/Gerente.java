/**
 * Aula 03 · Lab 1 (extends + super) e Lab 2 (sobrescrita).
 */
public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    // Lab 2: o salário do gerente é o da superclasse mais o bônus
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
