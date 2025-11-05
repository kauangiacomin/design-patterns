package designpattern.states;

import designpattern.Pedido;

public class Enviado extends State {

    public Enviado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String novo(Pedido pedido) {
        return "Ação 'novo' inválida para pedido enviado.";
    }

    @Override
    public String submeter(Pedido pedido) {
        return "Ação 'submeter' inválida para pedido enviado.";
    }

    @Override
    public String aprovar(Pedido pedido) {
        return "Ação 'aprovar' inválida para pedido enviado.";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Pedido já foi enviado.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Não é possível cancelar pedido enviado.";
    }
}
