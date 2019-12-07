package it.itis.cuneo;

public class Libreria {

    public static final int MAX_LIBRI = 6;
    private Libro[] vlibri;
    private int nlibri;

    public Libro[] getVlibri() { return vlibri; }
    public void setVlibri(Libro[] vlibri) { this.vlibri = vlibri; }
    public int getNlibri() { return nlibri; }
    public void setNlibri(int nlibri) { this.nlibri = nlibri; }

    public Libreria(){
        vlibri = new Libro[MAX_LIBRI];
        nlibri = 0;
    }

    public void aggiungiLibro(Libro toAdd) throws LibreriaPienaExeption {
        if(nlibri + 1 > MAX_LIBRI) {
            throw new LibreriaPienaExeption(1, "Troppe bottiglie");
        }
        vlibri[nlibri] = toAdd;
        nlibri++;
    }

    public static void main(String[] args) {

    }
}
