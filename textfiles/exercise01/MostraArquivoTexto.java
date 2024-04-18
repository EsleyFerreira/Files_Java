package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostraArquivoTexto {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("/home/esley/Documentos/Intellij/textfiles/exercise01/file.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println("Hello");
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
