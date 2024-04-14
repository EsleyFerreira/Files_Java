package br.edu.uniaeso;

import java.io.*;
public class Application {
    public static void main(String[] args) {
        File meuArquivo_Python = new File("/home/esley/Documentos/Intellij/textfiles/exercise04.meuarquivo.txt");

        try {
            meuArquivo_Python.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }

        BufferedReader meuArquivo;
        BufferedWriter meuArquivo_Python2;

        try {
            meuArquivo = new BufferedReader(new FileReader("/home/esley/Documentos/Intellij/textfiles/exercise05/meuarquivo.txt"));
            meuArquivo_Python2 = new BufferedWriter(new FileWriter("/home/esley/Documentos/Intellij/textfiles/exercise05/meuarquivo_python.txt"));

            String str;

            while ((str = meuArquivo.readLine()) != null) {
                meuArquivo_Python2.newLine();
                System.out.println(str.replaceAll("Java", "Python"));
                meuArquivo_Python2.write(str.replaceAll("Java", "Python"));
            }

            meuArquivo_Python2.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
