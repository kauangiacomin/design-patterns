package designpattern;

import gohorse.aplicacaolegada.ApiPagamentoLegado;
import gohorse.aplicacaomoderna.INovoGatewayPagamento;

public class AdapterPagamento implements INovoGatewayPagamento {

    private final ApiPagamentoLegado legado;

    public AdapterPagamento(ApiPagamentoLegado legado) {
        this.legado = legado;
    }

    @Override
    public boolean processarPagamento(String cartaoCredito, double valorTotal) {
        legado.realizarCobranca(valorTotal, cartaoCredito, "000");
        return true;
    }
}
