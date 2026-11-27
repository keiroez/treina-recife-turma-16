public class Pix implements FormaPagamento {
    @Override
    public String getNome() {
        return "Pix";
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Pix de R$ " + valor + " enviado.");
        return true;
    }
}
