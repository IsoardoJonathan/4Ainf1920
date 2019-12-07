/**
 * Created by inf.isoardoj1611 on 13/11/2019.
 */
public class ArchivioPienoException extends Exception {
    int codice;
    String descrizione;

    public ArchivioPienoException(int codice, String descrizione){
        this.codice = codice;
        this.descrizione = descrizione;
    }
}
