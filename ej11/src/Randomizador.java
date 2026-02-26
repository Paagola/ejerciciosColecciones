import java.util.ArrayList;

public class Randomizador {
    private ArrayList<String> palabras;
    
    public Randomizador() {
        this.palabras = new ArrayList<>();
    }

    public void ListaPalabrasRandomizadas(Diccionario diccionario){
        ArrayList<String> dicCompleto = new ArrayList<>();
        dicCompleto = diccionario.dicEspañol(dicCompleto);
        numeroPalabrasRandom(5, dicCompleto);
    }

    private void numeroPalabrasRandom(int num,  ArrayList<String> lista){
        for (int i = 0; i < num; i++) {
            int ran = (int)(Math.random()*lista.size());
            palabras.add(lista.get(ran));    
        }
    }

    public int tamaño(){
        return palabras.size();
    }

    public String getPos(int pos){
        return palabras.get(pos);
    }
}
