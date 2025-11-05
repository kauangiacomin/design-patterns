package designpattern.states;

import designpattern.Pedido;

public class Cancelado extends State {

    public Cancelado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String novo(Pedido pedido) {
        return "Ação 'novo' inválida para pedido cancelado.";
    }

    @Override
    public String submeter(Pedido pedido) {
        return "Ação 'submeter' inválida para pedido cancelado.";
    }

    @Override
    public String aprovar(Pedido pedido) {
        return "Ação 'aprovar' inválida para pedido cancelado.";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Ação 'enviar' inválida para pedido cancelado.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Pedido já está cancelado.";
    }
}
