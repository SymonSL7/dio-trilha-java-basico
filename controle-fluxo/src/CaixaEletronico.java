import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo, valorSolicitado;

        saldo = 25;

        System.out.println("Digite o valor à sacar:");
        valorSolicitado = scanner.nextDouble();
        
        if (valorSolicitado <= saldo){
        saldo = saldo - valorSolicitado;

            System.out.println("Saque efetuado com sucesso, seu saldo atual é: " + saldo);
        } else {
            System.err.println("Não foi possível efetuar o saque, pois seu saldo atual é: " + saldo);
        }

    }

}