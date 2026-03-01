import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private HashMap<String, Sinonimos> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void añadir(Sinonimos sinonimos, String ingles) {
        diccionario.put(ingles, sinonimos);
    }

    public Sinonimos buscar(String español) {

        Sinonimos sinonimos = new Sinonimos();
        if (buscarLista(español) == null) {
            return sinonimos;
        } else {
            if (buscarLista(español).tamaño() > 1) {
                for (int i = 0; i < buscarLista(español).tamaño(); i++) {
                    if (!buscarLista(español).pos(i).equals(español)) {
                        sinonimos.añadir(buscarLista(español).pos(i));
                    }
                }
                return sinonimos;
            } else {
                return sinonimos;
            }
        }
    }

    public Sinonimos buscarLista(String español) {
        for (Map.Entry<String, Sinonimos> palabras : diccionario.entrySet()) {
            for (int i = 0; i < palabras.getValue().tamaño(); i++) {
                if (palabras.getValue().pos(i).equals(español)) {
                    return palabras.getValue();
                }
            }
        }
        return null;
    }

    public void suplantarLista(Sinonimos sinonimos, String palabra) {
        for (Map.Entry<String, Sinonimos> lista : diccionario.entrySet()) {
            if (lista.getValue().equals(buscarLista(palabra))) {
                diccionario.replace(lista.getKey(), sinonimos);
            }
        }
    }
}
