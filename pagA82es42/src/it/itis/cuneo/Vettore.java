package it.itis.cuneo;

public class Vettore {

    private Punto inizio;
    private Punto fine;

    public Vettore(){ super(); }
    public Vettore(Punto inizio, Punto fine){
        this.inizio = new Punto(inizio);
        this.fine = new Punto(fine);
    }
    public Vettore(Vettore vettore){
        this.inizio = new Punto(vettore.getInizio());
        this.fine = new Punto(vettore.getFine());
    }

    public void setFine(Punto fine) { this.fine = new Punto(fine); }
    public void setInizio(Punto inizio) { this.inizio = new Punto(inizio); }
    public Punto getFine() { return fine; }

    public Punto getInizio() { return inizio; }

    public boolean equals(Vettore vettore) {
        boolean ret = false;

        if(this.inizio.equals(vettore.getInizio()) && this.fine.equals(vettore.getFine())){
            ret = true;
        }

        return ret;
    }

    public double lunghezza(){
        double addendo1 = Math.pow(this.inizio.getX()-this.fine.getX(), 2);
        double addendo2 = Math.pow(this.inizio.getY()-this.fine.getY(), 2);
        return Math.sqrt(addendo1 + addendo2);
    }
    public String toString(){
        return "Vettore{ \"inizio\": " + inizio + ", \"fine\": " + fine + " }";
    }

    public static void main(String[] args) {

        Punto p1 = new Punto(4, 6);
        Punto p2 = new Punto(8, 2);
        Vettore v1 = new Vettore(p1, p2);
        Vettore v2 = new Vettore(p1, p1);

        System.out.println();
        System.out.println("v1 > " + v1.toString());
        System.out.println(v2.toString());
        System.out.println();
        System.out.println("v2 > " + v2.equals(v2));
    }
}
