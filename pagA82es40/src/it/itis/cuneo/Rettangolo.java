package it.itis.cuneo;

public class Rettangolo {

    private Segmento lato1;
    private Segmento lato2;
    private Segmento lato3;
    private Segmento lato4;

    public Rettangolo(Segmento lato1, Segmento lato2, Segmento lato3, Segmento lato4){
        this.lato1 = new Segmento(lato1);
        this.lato2 = new Segmento(lato2);
        this.lato3 = new Segmento(lato3);
        this.lato4 = new Segmento(lato4);
    }
    public Rettangolo(Rettangolo rettangolo){
        this.lato1 = new Segmento(rettangolo.getLato1());
        this.lato2 = new Segmento(rettangolo.getLato2());
        this.lato3 = new Segmento(rettangolo.getLato3());
        this.lato4 = new Segmento(rettangolo.getLato4());
    }

    public void setLato1(Segmento lato1) { this.lato1 = new Segmento(lato1); }
    public void setLato2(Segmento lato2) { this.lato2 = new Segmento(lato2); }
    public void setLato3(Segmento lato3) { this.lato3 = new Segmento(lato3); }
    public void setLato4(Segmento lato4) { this.lato4 = new Segmento(lato4); }
    public Segmento getLato1() { return lato1; }
    public Segmento getLato2() { return lato2; }
    public Segmento getLato3() { return lato3; }

    public Segmento getLato4() { return lato4; }

    public int area(){
        return this.lato1.lunghezza() * this.lato2.lunghezza();
    }

    public void sposta(char verso, int distanza){
        int modificatore = 0;
        int i;

        if(verso == 'N' || verso == 'n' || verso == 'E' || verso == 'e'){
            modificatore = 1;
        }
        else{
            modificatore = -1;
        }

        if(verso == 'E' || verso == 'e' || verso == 'O' || verso == 'o'){
            for(i = 0; i < distanza; i++){
                this.lato1.spostaUtilitiesX(modificatore);
                this.lato2.spostaUtilitiesX(modificatore);
                this.lato3.spostaUtilitiesX(modificatore);
                this.lato4.spostaUtilitiesX(modificatore);
            }
        }
        else {
            for(i = 0; i < distanza; i++){
                this.lato1.spostaUtilitiesY(modificatore);
                this.lato2.spostaUtilitiesY(modificatore);
                this.lato3.spostaUtilitiesY(modificatore);
                this.lato4.spostaUtilitiesY(modificatore);
            }
        }
    }
    // metodo per il controllo e il ritorno per l'intersecazione di due rettangoli
    public boolean insersecazione(Rettangolo rettangolo2){
        Punto a1, a2, b1, b2;
        boolean interseca = false;

        a1 = this.lato1.getInizio();
        a2 = this.lato3.getInizio();
        b1 = rettangolo2.lato1.getInizio();
        b2 = rettangolo2.lato3.getInizio();

        if(((a1.getX()<=b1.getX() && b1.getX()<=a2.getX()) || (a1.getX()<=b2.getX() && b2.getX()<=a2.getX()))
            &&
           ((a1.getY()<=b1.getY() && b1.getY()<=a2.getY()) || (a1.getY()<=b2.getY() && (b2.getY()<=a2.getY())))){
            interseca = true;
        }

        return interseca;
    }

    public void ruota(){
        int variazione = (this.lato1.lunghezza() - this.lato2.lunghezza()) / 2;
        int distanzaCentro13 = this.lato2.lunghezza() / 2;
        int distanzaCentro24 = this.lato1.lunghezza() / 2;

        this.lato1.setInizio(this.lato1.getInizio().getX()+variazione, this.lato1.getInizio().getY()-distanzaCentro24+distanzaCentro13);
        this.lato4.setFine(this.lato1.getInizio().getX()+variazione, this.lato1.getInizio().getY()-distanzaCentro24+distanzaCentro13);

        this.lato2.setInizio(this.lato2.getInizio().getX()-distanzaCentro24+distanzaCentro13, this.lato2.getInizio().getY()-variazione);
        this.lato1.setFine(this.lato2.getInizio().getX()-distanzaCentro24+distanzaCentro13, this.lato2.getInizio().getY()-variazione);

        this.lato3.setInizio(this.lato3.getInizio().getX()-variazione, this.lato3.getInizio().getY()+distanzaCentro24-distanzaCentro13);
        this.lato2.setFine(this.lato3.getInizio().getX()-variazione, this.lato3.getInizio().getY()+distanzaCentro24-distanzaCentro13);

        this.lato4.setInizio(this.lato4.getInizio().getX()+distanzaCentro24-distanzaCentro13, this.lato4.getInizio().getY()+variazione);
        this.lato3.setFine(this.lato4.getInizio().getX()+distanzaCentro24-distanzaCentro13, this.lato4.getInizio().getY()+variazione);
    }

    public static void main(String[] args) {
        Punto a = new Punto(24,12);
        Punto b = new Punto(48,12);
        Punto c = new Punto(48,16);
        Punto d = new Punto(24,16);

        Segmento l1 = new Segmento(a,b);
        Segmento l2 = new Segmento(b,c);
        Segmento l3 = new Segmento(c,d);
        Segmento l4 = new Segmento(d,a);

        Rettangolo rettangolo = new Rettangolo(l1,l2,l3,l4);

        System.out.print("A >> ");
        System.out.println(a.toString());
        System.out.print("B >> ");
        System.out.println(b.toString());
        System.out.print("C >> ");
        System.out.println(c.toString());
        System.out.print("D >> ");
        System.out.println(d.toString());
        System.out.println();


        Punto a2 = rettangolo.lato1.getInizio();
        Punto b2 = rettangolo.lato2.getInizio();
        Punto c2 = rettangolo.lato3.getInizio();
        Punto d2 = rettangolo.lato4.getInizio();

        System.out.print("A >> ");
        System.out.println(a2.toString());
        System.out.print("B >> ");
        System.out.println(b2.toString());
        System.out.print("C >> ");
        System.out.println(c2.toString());
        System.out.print("D >> ");
        System.out.println(d2.toString());
    }
}
