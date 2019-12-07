public class Archivio {

    public static final int MAX_DIMENSIONE_ARCHIVIO = 10;
    private Programma[] vProgrammi;
    private int dimensioneArchivio;
    private int nProgrammi;


    public void setnProgrammi(int nProgrammi){ this.nProgrammi = nProgrammi; }
    public void setvProgrammi(Programma[] vProgrammi){ this.vProgrammi = vProgrammi; }
    public int getnProgrammi(){ return nProgrammi; }
    public Programma[] getvProgrammi(){ return vProgrammi; }

    public Archivio(){
        vProgrammi = new Programma[MAX_DIMENSIONE_ARCHIVIO];
        dimensioneArchivio = MAX_DIMENSIONE_ARCHIVIO;
        nProgrammi = 0;
    }
    public Archivio(int maxProgrammi){
        maxProgrammi = InputUtility.controlloInputArchivio(maxProgrammi, 1 , MAX_DIMENSIONE_ARCHIVIO);
        vProgrammi = new Programma[maxProgrammi];
        dimensioneArchivio = maxProgrammi;
        nProgrammi = 0;
    }

    public int aggiungiProgramma(Programma programma, int posizione){
        posizione = InputUtility.controlloInputArchivio(posizione, 1 , dimensioneArchivio);

        if(vProgrammi[posizione] != null){ return -1; }

        vProgrammi[posizione] = programma;
        nProgrammi++;
        return posizione;
    }

    public void sostituisciProgramma(Programma programma, int posizione){
        posizione = InputUtility.controlloInputArchivio(posizione, 1 , dimensioneArchivio);

        if(vProgrammi[posizione] != null){ nProgrammi++; }
        vProgrammi[posizione] = programma;
    }

    public void rimuoviProgramma(int posizione){
        if(vProgrammi[posizione] != null){
            vProgrammi[posizione] = null;
            nProgrammi--;
        }
    }

    public void ricercaProgrammaDenominazione(String denominazione){
        boolean trovato = false;
        int i = 0;

        while (!trovato && i <= dimensioneArchivio){

        }
    }
}
