package br.edu.ifpb.ads.padroes.atv2.ecommerce.domain.model;

public class PagamentoRequest implements Cloneable {

    private final String cliente;
    private final double valor;
    private final String moeda;

    private PagamentoRequest(Builder builder) {
        this.cliente = builder.cliente;
        this.valor = builder.valor;
        this.moeda = builder.moeda;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getMoeda() {
        return moeda;
    }

    @Override
    public String toString() {
        return "PagamentoRequest{" +
                "cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", moeda='" + moeda + '\'' +
                '}';
    }

    // Builder pattern
    public static class Builder {
        private String cliente;
        private double valor;
        private String moeda = "BRL"; // padrão

        public Builder cliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder valor(double valor) {
            this.valor = valor;
            return this;
        }

        public Builder moeda(String moeda) {
            this.moeda = moeda;
            return this;
        }

        public PagamentoRequest build() {
            return new PagamentoRequest(this);
        }
    }

    // Prototype - clone para criar cópia se precisar
    @Override
    public PagamentoRequest clone() {
        try {
            return (PagamentoRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
