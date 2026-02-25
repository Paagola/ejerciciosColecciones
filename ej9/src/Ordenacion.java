import java.util.HashMap;

public class Ordenacion {
    private HashMap<Integer, Carta> baraja;;

    public Ordenacion(HashMap<Integer, Carta> baraja) {
        this.baraja = baraja;
    }

    public void ordenar() {
        ordenadorPorBastos();
        ordenarPorNumer();
    }

    private HashMap<Integer, Carta> ordenadorPorBastos() {
        boolean salir = true;

        while (salir) {
            salir = false;
            for (int i = 1; i < this.baraja.size(); i++) {
                String nextCard = baraja.get(i+1).getTipo();
                String actualCard =  baraja.get(i).getTipo();
                if (actualCard.equals("Oro")
                        && (nextCard.equals("Bastos")
                                || nextCard.equals("Espadas")
                                || nextCard.equals("Copas"))) {
                
                        Carta carta = baraja.get(i);
                        baraja.put(i, baraja.get(i+1));
                        baraja.put(i+1, carta);
                        salir = true;

                } 
                else if (actualCard.equals("Espadas") && 
                            (nextCard.equals("Copas") || nextCard.equals("Bastos"))){
                        Carta carta = baraja.get(i);
                        baraja.put(i, baraja.get(i+1));
                        baraja.put(i+1, carta);
                        salir = true;
                } else if (actualCard.equals("Copas") && nextCard.equals("Bastos")){
                        Carta carta = baraja.get(i);
                        baraja.put(i, baraja.get(i+1));
                        baraja.put(i+1, carta);
                        salir = true;
                }
            }
        }
        return baraja;
    }

    public HashMap<Integer, Carta> ordenarPorNumer(){
         boolean salir = true;

        while (salir) {
            salir = false;
            for (int i = 1; i < this.baraja.size(); i++) {
                Carta nextCard = baraja.get(i+1);
                Carta actualCard =  baraja.get(i);
                if (nextCard.getTipo().equals(actualCard.getTipo()) && nextCard.getNumero() < actualCard.getNumero()){
                    Carta carta = baraja.get(i);
                    baraja.put(i, baraja.get(i+1));
                    baraja.put(i+1, carta);
                    salir = true;
                }
            }
        }
        return baraja;
    }
}
