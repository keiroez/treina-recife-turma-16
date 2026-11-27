/**
 * Aula 05 · Lab 2: a regra do saldo, agora como exceção.
 */
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
