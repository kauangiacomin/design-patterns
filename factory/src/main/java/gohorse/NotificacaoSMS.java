package gohorse;

public class NotificacaoSMS implements INotificacao {

    private String numeroTelefone;

    @Override
    public void configurar(String target) {
        this.numeroTelefone = target;
        System.out.println("Configurando SMS para: " + this.numeroTelefone);
    }

    @Override
    public void enviar(String message) {
        System.out.println("Enviando SMS para " + this.numeroTelefone + ": " + message);
    }
}