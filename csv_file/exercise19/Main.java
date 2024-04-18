import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String csvFile = "home/esley/Documentos/Intellij/exercise19/funcionarios.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Cargo do funcionário: ");
            String cargo = scanner.nextLine();
            System.out.print("Salário do funcionário: ");
            String salario = scanner.nextLine();

            String[] funcionario = {nome, cargo, salario};
            writer.writeNext(funcionario);

            System.out.println("Informações do funcionário adicionadas ao arquivo 'funcionarios.csv'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
