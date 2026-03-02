

public class App {
    public static void main(String[] args) throws Exception {
        Almacen<Libro> libros = new Almacen<>();
        Almacen<Pelicula> pelis = new Almacen<>();

        libros.añadir(new Libro("1", "Bernardo"));
        libros.añadir(new Libro("2", "Alfredo"));

        pelis.añadir(new Pelicula("3", "Peli 2"));

        libros.mostrarTodos();
        pelis.mostrarTodos();
        
    }
}
