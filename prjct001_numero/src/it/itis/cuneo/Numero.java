package it.itis.cuneo;

public class Numero {

    private int valore;

    public Numero(int valore){
        this.valore = valore;
    }

    public void setValore(int valore) { this.valore = valore; }
    public int getValore() { return valore; }

    public static void main(String[] args) {
        int x;

        Numero numero = new Numero(5);

        System.out.println(numero.getValore());

    }
}
