public class SmartTv{

    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
        System.out.println("TV Ligada!");
    }

    public void desligar(){
        ligada=false;
        System.out.println("TV Desligada!");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudou para o canal: " + canal);
    }


}