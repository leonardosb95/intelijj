package br.com.alura.bytebank.model;

import br.com.alura.bytebank.servico.ServicoPagamento;
import br.com.alura.bytebank.validador.ValidaPagamento;

import java.util.ArrayList;
import java.util.List;


public class RegistroDePagamento {
    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();
    private ServicoPagamento servico= new ServicoPagamento();


    public void registra(List<Pagamento> pagamentos) {
        servico.registra(pagamentos);
        exibeEfetuados();
    }

    public void exibeEfetuados() {
        if (!PAGAMENTOS.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < PAGAMENTOS.size(); i++) {
                System.out.println(PAGAMENTOS.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }



    private void salva(Pagamento pagamento) {
        PAGAMENTOS.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }
}
