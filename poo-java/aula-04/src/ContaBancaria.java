/**
 * Aula 04 · A ContaBancaria das aulas 01, 02 e 03, agora abstrata.
 * Ninguém abre uma conta "genérica" no banco: abre corrente, poupança ou digital.
 * Mudanças desde a aula 03: ganhou mostrar() (lab 1) e o fecharMes() abstrato (lab 2).
 */
public abstract class ContaBancaria {
    private String titular;
    protected double saldo; // protected desde a aula 03: as subclasses mexem no saldo

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public void mostrar() {
        System.out.println(titular + " · R$ " + saldo);
    }

    // abstrato: sem corpo. Cada tipo de conta é obrigado a dizer o que acontece no fim do mês.
    public abstract void fecharMes();
}
