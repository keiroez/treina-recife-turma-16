/**
 * Aula 05 · Lab 1: o contrato de qualquer forma de pagamento do app do banco.
 * Nesta versão, pagar devolve boolean, como o sacar das aulas 02 a 04.
 * (Exercício 1 de casa: trocar o boolean por exceção.)
 */
public interface FormaPagamento {
    String getNome();

    boolean pagar(double valor);
}
