package it.itis.cuneo;

public class CD {

    private String titolo;
    private String autore;
    private int numeroBrani;
    private double durata;

    public CD(){ super(); }
    public CD(String titolo, String autore, int numeroBrani, double durata){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public void setAutore(String autore) { this.autore = autore; }
    public void setDurata(double durata) { this.durata = durata; }
    public void setNumeroBrani(int numeroBrani) { this.numeroBrani = numeroBrani; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public String getAutore() { return autore; }
    public String getTitolo() { return titolo; }
    public int getNumeroBrani() { return numeroBrani; }
    public double getDurata() { return durata; }

    public String toString(){
        return "CD{ \"titolo\": " + titolo +
                ", \"autore\": " + autore +
                ", \"numeroBrani\": " + numeroBrani +
                ", \"durata\": " + durata +
                " }";
    }

    public boolean equalDurata(double durata){
        boolean ret = false;
        if(this.getDurata() == durata){ ret = true; }
        return ret;
    }

    public static void main(String[] args) {

    }
}
