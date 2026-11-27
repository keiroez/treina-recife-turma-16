/**
 * Aula 05 · Lab 1: o cartão tem limite, como o limite da conta corrente.
 * É a única forma de pagamento que pode recusar.
 */
public class CartaoCredito implements FormaPagamento {
    private double limiteDisponivel;

    public CartaoCredito(double limite) {
        this.limiteDisponivel = limite;
    }

    @Override
    public String getNome() {
        return "Cartão de crédito";
    }

    @Override
    public boolean pagar(double valor) {
        if (valor > limiteDisponivel) {
            return false;
        }
        limiteDisponivel -= valor;
        System.out.println("Cartão: R$ " + valor + " aprovado.");
        return true;
    }
}
