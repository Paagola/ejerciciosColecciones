import java.util.ArrayList;
import java.util.HashMap;

public class Almacen<T extends Identificable<String>> {

    private HashMap<String, T> inventario;

    public Almacen() {
        this.inventario = new HashMap<>();
    }

    public void añadir(T item){
        this.inventario.put(item.obtenerID(), item);
    }


    public void buscar(String id){
        this.inventario.get(id);
    }

    public void mostrarTodos(){
        ArrayList<String> keys = new ArrayList<>(this.inventario.keySet());

        for (String key : keys) {
            System.out.println(inventario.get(key));
        }
    }

}
