package designpattern.states;

import designpattern.Pedido;

public class Aprovado extends State {

    public Aprovado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String novo(Pedido pedido) {
        return "Ação 'novo' inválida para pedido aprovado.";
    }

    @Override
    public String submeter(Pedido pedido) {
        return "Ação 'submeter' inválida para pedido aprovado.";
    }

    @Override
    public String aprovar(Pedido pedido) {
        return "Pedido já aprovado.";
    }

    @Override
    public String enviar(Pedido pedido) {
        pedido.setState(new Enviado(pedido));
        return "Pedido enviado.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        pedido.setState(new Cancelado(pedido));
        return "Pedido cancelado após aprovação (estorno).";
    }
}
