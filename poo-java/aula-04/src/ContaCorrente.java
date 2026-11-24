/**
 * Aula 04 · A ContaCorrente da aula 03 (saque com limite) + a tarifa de R$ 10 no fim do mês.
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

    @Override
    public void fecharMes() {
        saldo -= 10; // tarifa mensal: é cobrada mesmo se o saldo estiver negativo
    }
}
