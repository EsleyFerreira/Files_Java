package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorLinhasArquivo {
    public static void main(String[] args){
        String nomeArquivo = "/home/esley/Documentos/Intellij/textfiles/exercise04/file.txt";

        try {
            FileReader arquivoLeitura = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivoLeitura);

            int contadorLinhas = 0;

            while (leitor.readLine() != null)
            {
                contadorLinhas++;
            }

            System.out.println("Numero de linhas no arquivos " + contadorLinhas);

            leitor.close();

        } catch (IOException e) {
            System.out.println("Error: Não foi possível contar as linhas do arquivos" + e.getMessage());
        }
    }
}
