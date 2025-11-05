package designpattern;

import gohorse.aplicacaolegada.ApiPagamentoLegado;
import gohorse.aplicacaolegada.ServicoPagamento;
import gohorse.aplicacaomoderna.INovoGatewayPagamento;
import gohorse.aplicacaomoderna.GatewayPagamentoModerno;

public class Cliente {
    public static void main(String[] args) {
        ServicoPagamento servico = new ServicoPagamento();
        INovoGatewayPagamento moderno = new GatewayPagamentoModerno();
        ApiPagamentoLegado legado = new ApiPagamentoLegado();

        INovoGatewayPagamento adapter = new AdapterPagamento(legado);

        servico.pagarPedido(moderno, legado, 100.0, "1111...", "123", false);

        servico.pagarPedido(adapter, legado, 200.0, "2222...", "456", true);
    }
}
