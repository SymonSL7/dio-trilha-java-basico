public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);

        System.out.println("------------------------------------------------------------------------------------------------------");

        smartTv.ligar();
        //System.out.println("Novo status - Tv ligada ? " + smartTv.ligada);
        
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(7);
        //System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        //System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        //System.out.println("Novo status - Tv ligada ? " + smartTv.ligada);

    }
}
