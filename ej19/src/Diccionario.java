import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private HashMap<Sinonimos, String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void añadir(Sinonimos sinonimos, String ingles) {
        diccionario.put(sinonimos, ingles);
    }

    public void buscar(String español) {

        if (buscarLista(español) == null) {
            System.out.println("No conozco esa palabra");
        } else {
            Sinonimos lista = buscarLista(español);
            if (lista.tamaño() > 1) {
                System.out.print("Los sinonimos de " + español + " son: ");
                for (int i = 0; i < lista.tamaño(); i++) {
                    if (!lista.pos(i).equals(español)) {
                        System.out.print(lista.pos(i) + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("Esa palabra no tiene sinonimos");
            }
        }

    }

    public Sinonimos buscarLista(String español) {
        for (Map.Entry<Sinonimos, String> palabras : diccionario.entrySet()) {
            Sinonimos lista = palabras.getKey();
            for (int i = 0; i < lista.tamaño(); i++) {
                if (lista.pos(i).equals(español)) {
                    return lista;
                }
            }
        }
        return null;
    }

}
