public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String cliente, String mensagem) {
        System.out.println("[e-mail para " + cliente + "] " + mensagem);
    }
}
