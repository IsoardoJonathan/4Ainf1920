package it.itis.cuneo;

public class PortaBottigliePienoExeption extends Exception {

    private int codice;
    private String descrizione;

    public void setCodice(int codice) { this.codice = codice; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public int getCodice() { return codice; }
    public String getDescrizione() { return descrizione; }

    public PortaBottigliePienoExeption(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    public String toString() {
        return "PortaBottigliePienoExeption{ " +
                "\"codice\": " + codice +
                ", \"descrizione\": " + descrizione +
                " }";
    }
}
