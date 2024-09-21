public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    
    //Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    public void ligarSmartTv() {
        ligada = true;
    }

    public void desligarSmartTv() {
        ligada = false;
    }

    
    //Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    public void aumentarVolume(){
        volume ++;
        // return "Volume aumentado para " + volume;
    }

    public void diminuirVolume(){
        volume --;
    }


    //Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}