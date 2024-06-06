package Aulas;

public class SmatTV {
    static boolean ligada = false;
    int canal = 2;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar o volume para: " + volume);
    }
    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuir o volume para: " + volume);
    }
    public static void ligar(){
        ligada = true;
    }
    
    public static void desligar(){
        boolean desligada = false;
    }

    public void aumentarDeCanal (){
        canal++;
    }

    public void diminuirDeCanal (){
        canal--;
    }
public void mudarCanal (int novoCanal){
        canal = novoCanal;
}
}
