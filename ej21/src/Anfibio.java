import java.util.HashMap;

public class Anfibio {
    private HashMap<String, HabAlim> anfibio;

    public Anfibio(String anfibio, HabAlim habAlim) {
        this.anfibio = new HashMap<>();
        this.anfibio.put(anfibio, habAlim);
    }

    public void datos(String nombre) {
        System.out.println(nombre + "\nHabitat: " + anfibio.get(nombre).getHabitat() + 
                                "\nAlimentacion: " + anfibio.get(nombre).getAlimentacion() );
    }

    public boolean buscar(String nombre){
        if (anfibio.get(nombre) != null){
            return true;
        }
        return false;
    }
}
