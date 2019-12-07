package it.itis.cuneo;

import java.util.Random;

public class Eccezione {

    public void generaEccezione() throws Exception{
        Random randomobj = new Random();
        Exception numeroZero = new Exception();
        if(randomobj.nextBoolean()) { throw numeroZero; }
    }

    public static void main(String[] args) {

        int count = 0;
        boolean eccezioneTrovata;
        Eccezione eccezioneobj = new Eccezione();
        Exception numeroZero = new Exception();

        while (count < 5){
            System.out.println();
            eccezioneTrovata = false;

            try{
                eccezioneobj.generaEccezione();
            }
            catch (Exception eccezione){
                count++;
                eccezioneTrovata = true;
                System.out.println("VV Generata eccezione numero: " + count + " VV");
                eccezione.printStackTrace();
            }

            if(!eccezioneTrovata){
                System.out.println("Nessuna eccezione trovata" );
            }
        }


    }
}
