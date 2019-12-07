package it.itis.cuneo;

public class Programma {

    private String denominazione;
    private String produttore;
    private String versioneSO;
    private int anno;

    public Programma(){ super(); }

    public Programma(String denominazione, String produttore, String versioneSO, int anno){
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versioneSO = versioneSO;
        this.anno = anno;
    }
    public Programma(Programma programma){
        this.denominazione = programma.getDenominazione();
        this.produttore = programma.getProduttore();
        this.versioneSO = programma.getVersioneSO();
        this.anno = programma.getAnno();
    }

    public void setAnno(int anno) { this.anno = anno; }
    public void setDenominazione(String denominazione) { this.denominazione = denominazione; }
    public void setProduttore(String produttore) { this.produttore = produttore; }
    public void setVersioneSO(String versioneSO) { this.versioneSO = versioneSO; }
    public String getDenominazione() { return denominazione; }
    public String getProduttore() { return produttore; }
    public String getVersioneSO() { return versioneSO; }
    public int getAnno() { return anno; }

    public String toString(){
        return "Programma{ \"denominazione\": " + denominazione +
                ", \"produttore\": " + produttore +
                ", \"versioneSO\": " + versioneSO +
                ", \"anno\": " + anno +
                " }";
    }

    public boolean equalAnno(int anno){
        boolean ret = false;
        if(this.getAnno() == anno){ ret = true; }
        return ret;
    }

    public static void main(String[] args) {

    }
}
