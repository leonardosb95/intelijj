package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.registrador.RegistroDePagamento;
import br.com.alura.bytebank.model.Tipo;
import br.com.alura.bytebank.visualizador.OpcoesPagamento;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

       new OpcoesPagamento().mensagemDeBoasVindas();
    }


}
