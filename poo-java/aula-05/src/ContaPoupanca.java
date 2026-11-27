/**
 * Aula 05 · A ContaPoupanca da aula 04, sem mudança de regra.
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaMensal; // 0.01 = 1% ao mês

    public ContaPoupanca(String titular, double saldoInicial, double taxaMensal) {
        super(titular, saldoInicial);
        this.taxaMensal = taxaMensal;
    }

    public void render() {
        if (saldo > 0) { // com saldo zero não há o que render, e o depositar(0) lançaria exceção
            depositar(saldo * taxaMensal);
        }
    }

    @Override
    public void fecharMes() {
        render();
    }
}
