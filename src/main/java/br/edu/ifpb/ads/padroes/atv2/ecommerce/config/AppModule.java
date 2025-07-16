package br.edu.ifpb.ads.padroes.atv2.ecommerce.config;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.factory.GatewayFactory;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.factory.GatewayFactoryImpl;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.gateway.PagamentoGateway;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class AppModule extends AbstractModule {

    private final String gatewayTipo;

    public AppModule(String gatewayTipo) {
        this.gatewayTipo = gatewayTipo;
    }

    @Override
    protected void configure() {
        bind(GatewayFactory.class).to(GatewayFactoryImpl.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    PagamentoGateway providePagamentoGateway(GatewayFactory factory) {
        return factory.criarGateway(gatewayTipo);
    }
}
