import java.util.Scanner;

public class CalculadoraDeMedias {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Symon", "Pietro", "Heitor", "Maria"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.println("Média da turma: " + media);

        
    }

    public static double calculaMediaDaTurma (String[]alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos){
    
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        
        return soma / alunos.length;
    
    }

}


