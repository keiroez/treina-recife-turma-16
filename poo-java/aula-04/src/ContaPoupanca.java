/**
 * Aula 04 · A ContaPoupanca da aula 03: no fim do mês, ela rende.
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaMensal; // 0.01 = 1% ao mês

    public ContaPoupanca(String titular, double saldoInicial, double taxaMensal) {
        super(titular, saldoInicial);
        this.taxaMensal = taxaMensal;
    }

    public void render() {
        depositar(saldo * taxaMensal);
    }

    @Override
    public void fecharMes() {
        render(); // reaproveita o render() da aula 03
    }
}
