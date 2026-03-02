public class Pelicula implements Identificable<String>{

    private String isbn;
    private String titulo;

    public Pelicula(String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String obtenerID() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return this.isbn + " " + this.titulo;
    }

}
