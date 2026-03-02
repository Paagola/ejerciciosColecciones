public class Libro implements Identificable<String>{

    private String codigoAlfabetico;
    private String director;

    public Libro(String codigoAlfabetico, String director){
        this.codigoAlfabetico = codigoAlfabetico;
        this.director = director;
    }

    public String getCodigoAlfabetico() {
        return codigoAlfabetico;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String obtenerID() {
        return this.codigoAlfabetico;
    }

    @Override
    public String toString() {
        return this.codigoAlfabetico + " " + this.director;
    }



}
