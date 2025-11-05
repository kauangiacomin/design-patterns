package designpattern.states;

import designpattern.Pedido;

public abstract class State {
    protected Pedido pedido;

    protected State(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract String novo(Pedido pedido);
    public abstract String submeter(Pedido pedido);
    public abstract String aprovar(Pedido pedido);
    public abstract String enviar(Pedido pedido);
    public abstract String cancelar(Pedido pedido);
}