package gohorse;

public interface INotificacao {

    void configurar(String target);

    void enviar(String message);

}