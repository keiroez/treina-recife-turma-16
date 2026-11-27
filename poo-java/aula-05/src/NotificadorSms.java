public class NotificadorSms implements Notificador {
    @Override
    public void enviar(String cliente, String mensagem) {
        System.out.println("[SMS para " + cliente + "] " + mensagem);
    }
}
