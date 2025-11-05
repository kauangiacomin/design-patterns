package designpattern.states;

import designpattern.Pedido;

public class Novo extends State {

    public Novo(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String novo(Pedido pedido) {
        return "Pedido já em estado Novo.";
    }

    @Override
    public String submeter(Pedido pedido) {
        pedido.setState(new Submetido(pedido));
        return "Pedido submetido. Aguardando pagamento.";
    }

    @Override
    public String aprovar(Pedido pedido) {
        return "Ação 'aprovar' inválida para pedido em Novo.";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Ação 'enviar' inválida para pedido em Novo.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        pedido.setState(new Cancelado(pedido));
        return "Pedido cancelado.";
    }
}