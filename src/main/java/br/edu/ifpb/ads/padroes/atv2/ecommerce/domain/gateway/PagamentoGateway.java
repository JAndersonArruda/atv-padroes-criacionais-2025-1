package br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.gateway;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.model.PagamentoRequest;

public interface PagamentoGateway {

    boolean pagar(PagamentoRequest request);
}
