package designpattern;

import designpattern.states.*;

public class Pedido {

    private State state;

    public Pedido() {
        this.state = new Novo(this);
        System.out.println("Pedido criado em Novo.");
    }

    void setState(State state) {
        this.state = state;
    }

    public String novo() {
        String res = state.novo(this);
        System.out.println(res);
        return res;
    }

    public String submeterPedido() {
        String res = state.submeter(this);
        System.out.println(res);
        return res;
    }

    public String aprovarPagamento() {
        String res = state.aprovar(this);
        System.out.println(res);
        return res;
    }

    public String enviarPedido() {
        String res = state.enviar(this);
        System.out.println(res);
        return res;
    }

    public String cancelarPedido() {
        String res = state.cancelar(this);
        System.out.println(res);
        return res;
    }
}
