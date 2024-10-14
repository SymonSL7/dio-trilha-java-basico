public class Operadores {
    public static void main(String[] args) {
        
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        System.out.println("-----------------------------------------------------------------------------------------------");

        int numero = 5;

        //System.out.println(- numero);

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        System.out.println("-----------------------------------------------------------------------------------------------");

        int numero2 = 5;

        int numero3 = 5;

        System.out.println(++numero2);

        System.out.println(--numero3);

        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        System.out.println("-----------------------------------------------------------------------------------------------");

        int a = 6;
        int b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        System.out.println("-----------------------------------------------------------------------------------------------");

        int numero4 = 1;
        int numero5= 2;

        boolean simNao;

        simNao = numero4 == numero5;

        System.out.println("Numero 1 é igual ao Número 2? " + simNao);

        simNao = numero4 != numero5;

        System.out.println("Numero 1 é diferente do Número 2? " + simNao);

        simNao = numero4 > numero5;

        System.out.println("Numero 1 é maior do que o Número 2? " + simNao);

        simNao = numero4 < numero5;

        System.out.println("Numero 1 é menor do que o Número 2? " + simNao);

        System.out.println("-----------------------------------------------------------------------------------------------");

        String nomeUm = "Symon";
        String nomeDois = "Symon";

        System.out.println(nomeUm.equals(nomeDois));

        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7>4)){
            System.out.println("As duas condições são verdaderias!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira!");            
        }



    }
}
