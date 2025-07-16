package br.edu.ifpb.ads.padroes.atv2.ecommerce;

import br.edu.ifpb.ads.padroes.atv2.ecommerce.application.PagamentoService;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.config.AppModule;
import br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.model.PagamentoRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        String[] gateways = {"paypal", "stripe", "pagseguro"};

        for (String gatewayTipo : gateways) {
            System.out.println("\n==== Usando gateway: " + gatewayTipo + " ====");
            Injector injector = Guice.createInjector(new AppModule(gatewayTipo));

            PagamentoService pagamentoService = injector.getInstance(PagamentoService.class);

            PagamentoRequest request = new PagamentoRequest.Builder()
                    .cliente("Cliente XYZ")
                    .valor(123.45)
                    .moeda("BRL")
                    .build();

            boolean sucesso = pagamentoService.pagar(request);

            System.out.println("Pagamento " + (sucesso ? "realizado com sucesso" : "falhou"));
        }
    }
}
