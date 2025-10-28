package gohorse;

public class Cliente {

    public static void main(String[] args) {
        final ServicoNotificacao servico = new ServicoNotificacao();

        servico.enviarNotificacao("EMAIL", "aluno@dominio.com", "Olá!");

        servico.enviarNotificacao("SMS", "+5599999999", "Oi!");
    }
}