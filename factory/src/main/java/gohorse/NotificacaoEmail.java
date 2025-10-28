package gohorse;

public class NotificacaoEmail implements INotificacao {

    private String emailDestino;

    @Override
    public void configurar(String target) {
        this.emailDestino = target;
        System.out.println("Configurando E-mail para: " + this.emailDestino);
    }

    @Override
    public void enviar(String message) {
        System.out.println("Enviando E-mail para " + this.emailDestino + ": " + message);
    }
}