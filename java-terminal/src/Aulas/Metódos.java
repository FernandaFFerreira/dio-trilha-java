package Aulas;

public class Metódos {
    public static void main(String[] args) {

        SmatTV smartTV = new SmatTV();

//Comandos de ligar e desligar a TV.

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

//Comandos de abaixar/aumentar o volume.

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual? " + smartTV.volume);

//Comandos de trocar de canal.

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual " + smartTV.canal);
        smartTV.diminuirDeCanal();
        System.out.println("Canal Atual " + smartTV.canal);
        smartTV.aumentarDeCanal();
        System.out.println("Canal Atual " + smartTV.canal);

    }
}
