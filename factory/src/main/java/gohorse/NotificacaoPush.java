package gohorse;

public class NotificacaoPush implements INotificacao {

    private String deviceId;

    @Override
    public void configurar(String target) {
        this.deviceId = target;
        System.out.println("Configurando Push para: " + this.deviceId);
    }

    @Override
    public void enviar(String message) {
        System.out.println("Enviando Push para " + this.deviceId + ": " + message);
    }
}