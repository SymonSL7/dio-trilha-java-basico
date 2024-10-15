import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double notaParaPassar = 7;
        double notaParaRecuperacao = 5.5;

        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        String resultado = nota >= notaParaPassar ? "Aprovado" : nota >= notaParaRecuperacao ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
    
}
