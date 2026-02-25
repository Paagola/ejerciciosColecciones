import java.util.HashMap;

public class Baraja {
    private HashMap<Integer, Carta> baraja = new HashMap<>();

    public Baraja(int numeroDeCartas) {
        boolean salir;
        for (int i = 1; i <= numeroDeCartas; i++) {
            
            if (i != 1) {
                do {
                    salir = false;
                    Carta carta = new Carta();
                    if (verifyRepeatsCards(carta)) {
                        salir = true;
                    }
                    if (!salir) this.baraja.put(i, carta);
                } while (salir);
            } else {
                this.baraja.put(i, new Carta());
            }
        }
    }

    public int getSize() {
        return this.baraja.size();
    }

    public String getCard(int pos) {
        return this.baraja.get(pos).toString();
    }

    private boolean verifyRepeatsCards(Carta card){
        for (int i = 1; i <= baraja.size(); i++) {
            if (baraja.get(i).toString().equals(card.toString())){
                return true;
            }
        }
        return false;
    }
}
