package gohorse;

public class ServicoNotificacao {

    public void enviarNotificacao(String tipo, String destinatario, String mensagem) {
        INotificacao notificacao;

        switch (tipo) {
            case "EMAIL":
                notificacao = new NotificacaoEmail();
                break;
            case "SMS":
                notificacao = new NotificacaoSMS();
                break;
            case "PUSH":
                notificacao = new NotificacaoPush();
                break;
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido");
        }

        notificacao.configurar(destinatario);
        notificacao.enviar(mensagem);
    }
}