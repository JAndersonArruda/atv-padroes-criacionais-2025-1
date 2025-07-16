package br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.factory;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.infrastructure.gateway.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.infrastructure.gateway.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.infrastructure.gateway.StripeGateway;

public class GatewayFactoryImpl implements GatewayFactory {

    @Override
    public PagamentoGateway criarGateway(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "paypal" -> new PayPalGateway();
            case "stripe" -> new StripeGateway();
            case "pagseguro" -> new PagSeguroGateway();
            default -> throw new IllegalArgumentException("Gateway desconhecido: " + tipo);
        };
    }
}
