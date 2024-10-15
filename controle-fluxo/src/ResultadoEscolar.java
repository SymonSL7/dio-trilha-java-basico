import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        if (nota >= 7 ){
            System.out.println("Aprovado!");
        }
        else { 
            System.out.println("Reprovado!");
        }
        
    }
}
