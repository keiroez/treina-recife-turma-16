/**
 * Aula 04 · Lab 2: a conta digital é isenta de tarifa com saldo de pelo menos R$ 500.
 * Abaixo disso, paga R$ 5 no fim do mês.
 */
public class ContaDigital extends ContaBancaria {

    public ContaDigital(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void fecharMes() {
        if (saldo < 500) {
            saldo -= 5;
        }
    }
}
