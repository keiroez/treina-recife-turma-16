/**
 * Aula 05 · Bloco 1: uma interface é um contrato.
 * O banco avisa o cliente de cada movimentação; a interface diz O QUE fazer, não COMO.
 */
public interface Notificador {
    void enviar(String cliente, String mensagem);
}
