/**
 * Aula 03 · Atividade em dupla: a conta corrente tem limite (cheque especial).
 * O saldo pode ficar negativo, mas nunca abaixo de -limite.
 */
public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo + limite) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
