package it.itis.cuneo;

import java.util.Objects;

public class Bottiglia {

    private double capienza;
    private String materiale;
    private String colore;

    public void setCapienza(double capienza) { this.capienza = capienza; }
    public void setMateriale(String materiale) { this.materiale = materiale; }
    public void setColore(String colore) { this.colore = colore; }
    public double getCapienza() { return capienza; }
    public String getMateriale() { return materiale; }
    public String getColore() { return colore; }

    public Bottiglia() { }
    public Bottiglia(double capienza, String materiale, String colore) {
        this.capienza = capienza;
        this.materiale = materiale;
        this.colore = colore;
    }
    public Bottiglia(Bottiglia bottiglia){
        this.capienza = bottiglia.getCapienza();
        this.materiale = bottiglia.getMateriale();
        this.colore = bottiglia.getColore();
    }

    public String toString() {
        return "Bottiglia{ " +
                "\"capienza\": " + capienza +
                ", \"materiale\": " + materiale +
                ", \"colore\": " + colore +
                " }";
    }
}
