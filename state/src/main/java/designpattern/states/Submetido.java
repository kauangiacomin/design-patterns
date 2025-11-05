package designpattern.states;

import designpattern.Pedido;

public class Submetido extends State {

    public Submetido(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String novo(Pedido pedido) {
        return "Ação 'novo' inválida para pedido submetido.";
    }

    @Override
    public String submeter(Pedido pedido) {
        return "Pedido já foi submetido.";
    }

    @Override
    public String aprovar(Pedido pedido) {
        pedido.setState(new Aprovado(pedido));
        return "Pagamento aprovado.";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "Ação 'enviar' inválida antes da aprovação.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        pedido.setState(new Cancelado(pedido));
        return "Pedido cancelado.";
    }
}
