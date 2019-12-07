package it.itis.cuneo;

public class Libro {
    private String titolo;
    private String autore;
    private String isbn;

    public Libro(String titolo, String isbn, String autore) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.autore = autore;
    }
    public Libro(Libro libro) {
        this.titolo = libro.getTitolo();
        this.isbn = libro.getIsbn();
        this.autore = libro.getAutore();
    }

    public void setTitolo(String titolo) { this.titolo = titolo; }
    public void setAutore(String autore) { this.autore = autore; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
    public String getIsbn() { return isbn; }

    public boolean equals(Libro libro) {
        boolean equals = false;

        if (titolo != null && titolo.equals((libro.getTitolo())) && autore != null && autore.equals(libro.getAutore()) && isbn != null && isbn.equals(libro.isbn)) {
            equals = true;
        }

        return  equals;
    }
}