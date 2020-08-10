package br.com.alura.bytebank.validador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.util.List;

public class ValidaPagamento {
    public ValidaPagamento() {
    }

    public void verificaTipo(Pagamento pagamento) {
        if (pagamento.getTipo().equals(Tipo.CREDITO)) {
            pagamento.setValor(pagamento.getValor() * 1.02);
        }
        if (pagamento.getTipo().equals(Tipo.DEBITO)) {
            pagamento.setValor(pagamento.getValor() * 1.001);
        }
    }

    public void verificaTipo(List<Pagamento> pagamentos) {
        for (Pagamento pagamento:pagamentos) {
            verificaTipo(pagamento);
        }
    }
}