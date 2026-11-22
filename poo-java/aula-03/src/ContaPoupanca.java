/**
 * Aula 03 · Atividade em dupla: a poupança não tem limite, mas rende.
 * O sacar() é o da ContaBancaria, herdado sem mudança.
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaMensal; // 0.01 = 1% ao mês

    public ContaPoupanca(String titular, double saldoInicial, double taxaMensal) {
        super(titular, saldoInicial);
        this.taxaMensal = taxaMensal;
    }

    public void render() {
        depositar(saldo * taxaMensal); // reaproveita a regra do depositar
    }
}
