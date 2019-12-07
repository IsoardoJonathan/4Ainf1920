package it.itis.cuneo;

public class Angolo {

    private int g; // gradi
    private int p; // primi
    private int s; // secondi

    public Angolo(){
        super();
    }
    public Angolo(int g, int p, int s){
        this.g = g;
        this.p = p;
        this.s = s;
        this.secondi2angolo(this.angolo2secondi());
    }
    public Angolo(Angolo angolo){
        super();
        this.g = angolo.g;
        this.p = angolo.p;
        this.s = angolo.s;
    }

    public void setG(int x){
        this.g = x;
    }
    public int getG(){
        return this.g;
    }
    public void setP(int x){
        this.p = x;
    }
    public int getP(){
        return this.p;
    }
    public void setS(int x){ this.s = x; }
    public int getS(){
        return this.s;
    }

    public void visualizzaAngolo(){
        System.out.println("Angolo: " + this.g + "°" + this.p + "'" + this.s + "\"");
    }

    public void aggiungiGradi(int x){
        this.g += x;
    }
    public void aggiungiPrimi(int x){
        this.p += x;
    }
    public void aggiungiSecondi(int x){
        this.s += x;
    }

    public int angolo2secondi(){
        return ((((this.g * 60) + this.p) * 60) + this.s);
    }
    public void secondi2angolo(int x){
        this.s = x % 60;
        this.p = (x / 60) % 60;
        this.g = (x / 60) / 60;
        while(this.g > 360){
            this.g -= 360;
        }
    }

    public int differenzaSecondi(Angolo x){
        int differenza = this.angolo2secondi() - x.angolo2secondi();
        if(differenza < 0){
            differenza *= -1;
        }
        return differenza;
    }

    public void sommaAngolo(Angolo x){
        this.secondi2angolo(this.angolo2secondi() + x.angolo2secondi());
    }

    public static void main(String[] args) {
        Angolo angoloUno = new Angolo(204, 50, 7);
        Angolo angoloDue = new Angolo(12, 34, 26);


    }
}
