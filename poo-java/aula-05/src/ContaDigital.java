/**
 * Aula 05 · A ContaDigital da aula 04, sem mudança.
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
