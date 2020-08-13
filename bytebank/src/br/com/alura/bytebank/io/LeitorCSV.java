package br.com.alura.bytebank.io;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeitorCSV extends Leitor implements LeitorPagamento {

    @Override
    public List<Pagamento> ler(int codigo) throws IOException {
        String arquivo = devolveArquivo(codigo);

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        Path caminho = Paths.get(arquivo);

        List<String> linhas = Files.readAllLines(caminho, Charset.forName("UTF-8"));

        linhas.forEach(linha -> {
            String[] palavras = linha.split(",");
            if (!linha.isEmpty()) {
                Double valor=0.00;
                try {
                 valor = Double.parseDouble(palavras[0]);

                }catch (Exception e){
                    valor = Double.parseDouble(palavras[0].substring(1,palavras[0].length()));
                }
                String descricao = palavras[1];
                Tipo tipo=null;
                try {
                    tipo = Tipo.valueOf(palavras[2]);

                }catch (Exception e){
                    tipo = Tipo.valueOf(palavras[2].substring(0,palavras[2].length()-1));
                }

                Pagamento pagamento = new Pagamento(tipo, valor, descricao);
                pagamentos.add(pagamento);
            }
        });

        geraBackup(caminho);
        return pagamentos;
    }

}
