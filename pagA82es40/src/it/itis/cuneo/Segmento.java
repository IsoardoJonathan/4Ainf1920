package it.itis.cuneo;

public class Segmento {

    private Punto inizio;
    private Punto fine;

    public Segmento(Punto inizio, Punto fine){
        this.inizio = new Punto(inizio);
        this.fine = new Punto(fine);
    }
    public Segmento(Segmento segmento){
        this.inizio = new Punto(segmento.getInizio());
        this.fine = new Punto(segmento.getFine());
    }

    public void setInizio(Punto inizio) { this.inizio = new Punto (inizio); }
    public void setInizio(int x, int y) { this.inizio.setX(x); this.inizio.setY(y); }
    public void setFine(Punto fine) { this.fine = new Punto(fine); }
    public void setFine(int x, int y) { this.fine.setX(x); this.fine.setY(y); }
    public Punto getInizio() { return inizio; }

    public Punto getFine() { return fine; }

    public int lunghezza(){
        double addendo1 = Math.pow(this.inizio.getX()-this.fine.getX(), 2);
        double addendo2 = Math.pow(this.inizio.getY()-this.fine.getY(), 2);
        return (int) Math.sqrt(addendo1 + addendo2);
    }

    public void spostaUtilitiesX(int modificatore){
        int coordinata = this.inizio.getX();
        if(coordinata != 0 && coordinata != 800){
            this.inizio.setX(coordinata += modificatore);
        }
        coordinata = this.fine.getX();
        if(coordinata != 0 && coordinata != 800){
            this.fine.setX(coordinata += modificatore);
        }
    }
    public void spostaUtilitiesY(int modificatore){
        int coordinata = this.inizio.getY();
        if(coordinata != 0 && coordinata != 600){
            this.inizio.setY(coordinata += modificatore);
        }
        coordinata = this.fine.getY();
        if(coordinata != 0 && coordinata != 600){
            this.fine.setY(coordinata += modificatore);
        }
    }

    public static void main(String[] args) {

    }
}
