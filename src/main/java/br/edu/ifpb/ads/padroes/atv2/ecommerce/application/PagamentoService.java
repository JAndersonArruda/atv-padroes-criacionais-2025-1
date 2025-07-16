package br.edu.ifpb.ads.padroes.atv2.ecommerce.application;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.model.PagamentoRequest;

import javax.inject.Inject;

public class PagamentoService {

    private final PagamentoGateway gateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public boolean pagar(PagamentoRequest request) {
        System.out.println("PagamentoService: iniciando pagamento...");
        return gateway.pagar(request);
    }
}
