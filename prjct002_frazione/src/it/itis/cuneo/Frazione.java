package it.itis.cuneo;

public class Frazione {

    private int numeratore;
    private int denominatore;

    public Frazione(){ super(); }
    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
    public Frazione(Frazione frazione){
        this.numeratore = frazione.getNumeratore();
        this.denominatore = frazione.getDenominatore();
    }

    public void setNumeratore(int numeratore) { this.numeratore = numeratore; }
    public void setDenominatore(int denominatore) { this.denominatore = denominatore; }
    public int getNumeratore() { return numeratore; }
    public int getDenominatore() { return denominatore; }

    public Frazione calcSomma(Frazione addendo){
        Frazione ret = new Frazione();
        ret.setNumeratore(numeratore*addendo.getDenominatore() + addendo.getNumeratore()*denominatore);
        ret.setDenominatore(denominatore*addendo.getDenominatore());
        return ret;
    }

    public Frazione calcDifferenza(Frazione sottraendo){
        Frazione ret = new Frazione();
        ret.setNumeratore(numeratore*sottraendo.getDenominatore() - sottraendo.getNumeratore()*denominatore);
        ret.setDenominatore(denominatore*sottraendo.getDenominatore());
        return ret;
    }

    public Frazione calcMoltiplicazione(Frazione fattore){
        Frazione ret = new Frazione();
        ret.setNumeratore(numeratore*fattore.getNumeratore());
        ret.setDenominatore(denominatore*fattore.getDenominatore());
        return ret;
    }

    public Frazione calcDivisione(Frazione divisore){
        Frazione ret = new Frazione();
        ret.setNumeratore(numeratore*divisore.getDenominatore());
        ret.setDenominatore(denominatore*divisore.getNumeratore());
        return ret;
    }

    public void semplifica() {
        int resto;
        do {
            resto = numeratore % denominatore;
            numeratore = denominatore;
            denominatore = resto;
        } while (resto != 0);
    }


    public void reciproco() {
        int temp;

        temp = numeratore;
        this.setNumeratore(denominatore);
        this.setDenominatore(temp);
    }

    public static void main(String[] args) {

    }

}
