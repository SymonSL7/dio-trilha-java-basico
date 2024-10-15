import java.util.Scanner;

public class PlanoOperadora {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a letra inicial do plano desejado? [B] = Basic - [M] = Midia - [T] = Turbo ");
        String planoDesejado = scanner.next();

        switch (planoDesejado) {

            case "T":{                
                System.out.println("5GB para acessar o YouTube.");                
            }
            case "M":{                
                System.out.println("WhatsApp e Instagram grátis.");                
            }
            case "B":{
                System.out.println("100 minutos de ligação.");
                break;
            }
                        
            default:{
                System.out.println("Plano Invalido!");
            }
                break;
        }


    }

}
