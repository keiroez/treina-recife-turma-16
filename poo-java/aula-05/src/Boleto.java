public class Boleto implements FormaPagamento {
    @Override
    public String getNome() {
        return "Boleto";
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Boleto de R$ " + valor + " pago.");
        return true;
    }
}
