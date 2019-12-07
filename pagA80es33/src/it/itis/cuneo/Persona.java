package it.itis.cuneo;

public class Persona {

    private int eta;
    private String nome;
    private char sesso;
    private String professione;

    public Persona(){ super(); }
    public Persona(int eta, String nome, char sesso, String professione){
        this.eta = eta;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;
    }

    public void setEta(int eta) { this.eta = eta; }
    public void setNome(String nome) { this.nome = nome; }
    public void setProfessione(String professione) { this.professione = professione; }
    public void setSesso(char sesso) { this.sesso = sesso; }
    public int getEta() { return eta; }
    public String getNome() { return nome; }
    public char getSesso() { return sesso; }
    public String getProfessione() { return professione; }

    public String toString(){
        return "Persona{ \"età\": " + eta +
                ", \"nome\": " + nome +
                ", \"sesso\": " + sesso +
                ", \"professione\": " + professione +
                " }";
    }

    public static void main(String[] args) {
        Persona persona = new Persona(32, "Joj", 'M',"Studente");
        System.out.println(persona.toString());
    }
}
