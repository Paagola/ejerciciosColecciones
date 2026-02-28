import java.util.ArrayList;

public class Sinonimos {
    private ArrayList<String> sinonimos;

    public Sinonimos(String palabra1){
        this.sinonimos = new ArrayList<>();
        sinonimos.add(palabra1);
    }

    public Sinonimos(String palabra1, String palabra2){
        this.sinonimos = new ArrayList<>();
        sinonimos.add(palabra1);
        sinonimos.add(palabra2);
    }

    public Sinonimos(String palabra1, String palabra2, String palabra3){
        this.sinonimos = new ArrayList<>();
        sinonimos.add(palabra1);
        sinonimos.add(palabra2);
        sinonimos.add(palabra3);
    }

    public Sinonimos(String palabra1, String palabra2, String palabra3, String palabra4){
        this.sinonimos = new ArrayList<>();
        sinonimos.add(palabra1);
        sinonimos.add(palabra2);
        sinonimos.add(palabra3);
        sinonimos.add(palabra4);
    }

    public void añadir(String sinonimo){
        sinonimos.add(sinonimo);
    }

    public int tamaño(){
        return sinonimos.size();
    }

    public String pos(int pos){
        return sinonimos.get(pos);
    }
}
