package br.edu.uniaeso;
import java.io.InputStream
import java.io.FileInputStream
import java.io.*;

public class PrimeirosBytesArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "home/esley/Documentos/Intellij/binaryfile/exercise16/arquivo.bin";

        try (InputStream inputStream = new FileInputStream(nomeArquivo)) {
            byte[] buffer = new byte[100];
            int bytesRead = inputStream.read(buffer);

            if (bytesRead != -1) {
                System.out.println("Primeiros 100 bytes do arquivo:");
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
            } else {
                System.out.println("O arquivo está vazio.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
