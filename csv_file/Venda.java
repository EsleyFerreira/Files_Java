package br.edu.uniaeso;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String data;
    private double valor;
    private String produtoVendido;

    public Venda(String data, double valor, String produtoVendido) {
        this.data = data;
        this.valor = valor;
        this.produtoVendido = produtoVendido;
    }

    public static void main(String[] args) {
      
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda("2023-05-10", 100.0, "Produto A"));
        vendas.add(new Venda("2023-05-11", 150.0, "Produto B"));
        vendas.add(new Venda("2023-05-12", 200.0, "Produto C"));
      
        exportarParaCSV(vendas);
    }

    private static void exportarParaCSV(List<Venda> vendas) {
        String arquivoCSV = "/home/esley/Documentos/Intellij/csv_file/exercise25/vendas.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(arquivoCSV))) {
        
            String[] cabecalho = {"Data", "Valor", "Produto Vendido"};
            writer.writeNext(cabecalho);

            for (Venda venda : vendas) {
                String[] linha = {venda.getData(), String.valueOf(venda.getValor()), venda.getProdutoVendido()};
                writer.writeNext(linha);
            }

            System.out.println("Vendas exportadas para " + arquivoCSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
