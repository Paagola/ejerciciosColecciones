import java.util.HashMap;

public class Card {
    
    HashMap<String, Integer> valores;

    public Card(){
        this.valores = new HashMap<>();

        valores.put(tipo(), valor());
    }

    public String getTipo() {
        return valores.keySet().iterator().next();
    }

    public int getValor() {
        return valores.values().iterator().next();
    }

    private int valor(){
        return (int)(Math.random()*12)+1;

        

    }

    private String tipo(){
        int ran = (int)(Math.random()*4)+1;

        switch (ran) {
            case 1:
                return "Oro";
            case 2:
                return "Copas";
            case 3:
                return "Espadas";
            case 4:
                return "Bastos";
        } 
        return null;
    }
}
