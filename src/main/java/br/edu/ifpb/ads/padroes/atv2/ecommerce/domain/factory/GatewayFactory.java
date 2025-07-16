package br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.factory;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.gateway.PagamentoGateway;

public interface GatewayFactory {

    PagamentoGateway criarGateway(String tipo);
}
