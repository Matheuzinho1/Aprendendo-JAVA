import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o ano que você nasceu: ");
        int anoNascimento = ler.nextInt();
        System.out.println("Insira o mês que você nasceu: ");
        int mesNascimento = ler.nextInt();
        System.out.println("Insira o dia que você nasceu: ");
        int diaNascimento = ler.nextInt();

        LocalDate dataAtual = LocalDate.now();
        
        int idade = dataAtual.getYear() - anoNascimento;
        
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento); 
        long meses = ChronoUnit.MONTHS.between(dataNascimento, dataAtual);
        long dias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("Você tem " + idade + " anos, " + meses + " meses e " + dias + " dias.");

        ler.close();
    }
}
