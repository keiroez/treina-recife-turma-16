/**
 * Aula 05 · Lab 2: o sacar() da corrente também passa a lançar exceção.
 * Quando a ContaBancaria mudou o sacar para void, o compilador apontou esta classe: ela precisa seguir junto.
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
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor do saque deve ser positivo");
        }
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException("limite insuficiente para sacar R$ " + valor + " (saldo R$ " + saldo + ", limite R$ " + limite + ")");
        }
        saldo -= valor;
    }

    @Override
    public void fecharMes() {
        saldo -= 10; // tarifa mensal
    }
}
