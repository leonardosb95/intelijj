package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Pagamento {

    private String descricao;
    private Tipo tipo;
    private double valor;
    private LocalDate data;

    public Pagamento(Tipo tipo,double valor,String descricao) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
        this.data=LocalDate.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
