import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }


    public void añadirEspFranPor() {
        diccionario.put("España", "Madrid");
        diccionario.put("Portugal", "Lisboa");
        diccionario.put("Francia", "Paris");
    }

    public void añadirCapPais(String pais, String capital){
        diccionario.put(pais, capital);
    }

    public String buscarCapital(String pais) {
        return diccionario.get(pais) == null? null: diccionario.get(pais);
    }

    public String buscarPais(String capital){
        for (Map.Entry<String, String> valor : diccionario.entrySet()){
            if (valor.getValue().equals(capital)){
                return valor.getKey();
            }
        }
        return null;
    }
}
