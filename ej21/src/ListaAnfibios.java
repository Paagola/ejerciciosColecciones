import java.util.ArrayList;

public class ListaAnfibios {
    private ArrayList<Anfibio> lista;

    public ListaAnfibios() {
        this.lista = new ArrayList<>();
    }

    public void añadir(String nombre, String habitat, String alimentacion){
        this.lista.add(new Anfibio(nombre, new HabAlim(habitat, alimentacion)));
    }

    public void buscar(String nombre){
        boolean findit = false;
        for (Anfibio anfibio : lista) {
            if (anfibio.buscar(nombre)){
                anfibio.datos(nombre);
                findit = true;
            }
        }
        if (!findit){
            System.out.println("No hemos encontrado ese anfibio");
        }
    }
}
