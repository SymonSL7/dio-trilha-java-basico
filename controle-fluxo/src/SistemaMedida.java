import java.util.Scanner;

public class SistemaMedida {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a medida [P] - [M] - [G]");
        String medida = scanner.next();

        switch (medida){

            case "P":{
            System.out.println("Tamanho Pequeno!");
            break;
            }
            case "M":{
            System.out.println("Tamanho Médio");
            break;
            }
            case "G":{
            System.out.println("Tamanho Grande");
            break;
            }
            default:{
                System.out.println("Indefinido!");
            }

        }
    }

}
