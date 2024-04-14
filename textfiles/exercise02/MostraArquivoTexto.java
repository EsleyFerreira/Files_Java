package br.edu.uniaeso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostraArquivoTexto {
    public static void main(String[] args) {
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader("/home/esley/Documentos/Intellij/textfiles/exercise02/file.txt"));
            String str;
            while ((str = in.readLine()) != null)
                System.out.println(str);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
