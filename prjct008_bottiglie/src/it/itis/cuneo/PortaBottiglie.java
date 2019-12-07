package it.itis.cuneo;

public class PortaBottiglie {

    public static final int MAX_BOTTIGLIE = 6;
    private Bottiglia[] vBottiglie;
    private int nBottiglie;

    public Bottiglia[] getvBottiglie() { return vBottiglie; }
    public void setvBottiglie(Bottiglia[] vBottiglie) { this.vBottiglie = vBottiglie; }
    public int getnBottiglie() { return nBottiglie; }
    public void setnBottiglie(int nBottiglie) { this.nBottiglie = nBottiglie; }

    public PortaBottiglie(){
        vBottiglie = new Bottiglia[MAX_BOTTIGLIE];
        nBottiglie = 0;
    }

    public void aggiungiBottiglia(Bottiglia toAdd) throws PortaBottigliePienoExeption{
        if(nBottiglie + 1 > MAX_BOTTIGLIE) {
            throw new PortaBottigliePienoExeption(1, "Troppe bottiglie");
        }
        vBottiglie[nBottiglie] = toAdd;
        nBottiglie++;
    }

    public static void main(String[] args) {

    }
}
