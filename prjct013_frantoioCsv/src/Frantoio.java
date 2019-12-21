import java.util.ArrayList;
import java.util.List;

public class Frantoio {

    //List<E> è un interfaccia di ArrayList<E>
    //ArrayList<E> implementa List<E>
    private ArrayList<Oliva> listaOlive;

    public Frantoio() { super(); }
    public Frantoio(ArrayList<Oliva> listaOlive) {
        this.listaOlive = listaOlive;
    }

    public ArrayList<Oliva> getListaOlive() {
        return listaOlive;
    }

    @Override
    public String toString() {
        return "Olive:\n" + listaOlive;
    }
}
