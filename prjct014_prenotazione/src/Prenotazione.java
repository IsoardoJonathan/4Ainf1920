public class Prenotazione {

    public static final String SEPARATOR = ",";

    private String nome;
    private String cognome;
    private long telefono;
    private String cittaPartenza;
    private String cittaDestinazione;
    private String data;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCittaPartenza(String cittaPartenza) {
        this.cittaPartenza = cittaPartenza;
    }

    public void setCittaDestinazione(String cittaDestinazione) {
        this.cittaDestinazione = cittaDestinazione;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Prenotazione() { }

    public String toRowCsv() {
        return "Prenotazione" + SEPARATOR +
                nome + SEPARATOR +
                cognome + SEPARATOR +
                telefono + SEPARATOR +
                cittaPartenza + SEPARATOR +
                cittaDestinazione + SEPARATOR +
                data + "\n";
    }
}