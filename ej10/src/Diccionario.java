import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario(){
        this.diccionario = new HashMap<>();
    }

    public void añadirPalabra(String español, String ingles){
        this.diccionario.put(español, ingles);
    }

    public String buscarTradEspañol(String español){
        return this.diccionario.get(español);
    }

    public String buscarTradIngles(String ingles){
        for (Map.Entry<String,String> value : diccionario.entrySet()) {
            if(value.getValue().equals(ingles)){
                return value.getKey();
            }
        }
        return "";
    }
}
