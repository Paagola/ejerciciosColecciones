import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Liga<T extends Comparable<T>>{
    private String nombre;
    private HashMap<String, T> equipos;

    public Liga(String nombre) {
        this.equipos = new HashMap<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void inscribir(String participante, T item){
        this.equipos.put(participante, item);
    }

    public List<T> clasificacion(){
        List<T> clasificacion = new ArrayList<>(equipos.values());

        Collections.sort(clasificacion);
 
        return clasificacion;
    }

    public String get(T item){
        for (Map.Entry<String, T> v : this.equipos.entrySet()){
            if (v.getValue() == item){
                return v.getKey();
            }
        }
        return "";
    }
}
