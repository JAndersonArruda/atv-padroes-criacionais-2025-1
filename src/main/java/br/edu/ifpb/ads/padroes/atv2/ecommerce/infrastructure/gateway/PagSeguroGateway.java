package br.edu.ifpb.ads.padroes.atv2.ecommerce.infrastructure.gateway;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.model.PagamentoRequest;

public class PagSeguroGateway implements PagamentoGateway {

    @Override
    public boolean pagar(PagamentoRequest request) {
        System.out.println("Processando pagamento via PagSeguro: " + request);
        // Simula chamada API PagSeguro
        return true;
    }
}
