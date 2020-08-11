package br.com.alura.bytebank.registrador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.servico.ServicoPagamento;
import br.com.alura.bytebank.validador.ValidaPagamento;

import java.util.ArrayList;
import java.util.List;


public class RegistroDePagamento {
    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();


    public void registra(List<Pagamento> pagamentos) {
        for (Pagamento pagamento : pagamentos) {
            salva(pagamento);
        }
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
