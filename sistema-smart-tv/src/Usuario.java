public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("Estado da TV: " + (smartTv.ligada == true?"Ligada":"Desligada"));
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        
        smartTv.ligarSmartTv();
        System.out.println("Estado da TV: " + (smartTv.ligada == true?"Ligada":"Desligada"));
        
        smartTv.desligarSmartTv();
        System.out.println("Estado da TV: " + (smartTv.ligada == true?"Ligada":"Desligada"));

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);




        
    }
}
