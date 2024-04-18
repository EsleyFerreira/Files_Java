import java.io.*;

public class CopiaArquivoGrande {
    public static void main(String[] args) {
        String arquivoOrigem = "home/esley/Documentos/Intellij/exercise15/arquivo_grande.bin";
        String arquivoDestino = "home/esley/Documentos/Intellij/exercise15/copia_arquivo_grande.bin";

        try (InputStream in = new FileInputStream(arquivoOrigem);
             OutputStream out = new FileOutputStream(arquivoDestino)) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}