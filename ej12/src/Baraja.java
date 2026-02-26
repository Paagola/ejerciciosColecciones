
import java.util.ArrayList;

public class Baraja {
    private ArrayList<Card> baraja;

    public Baraja(int numcartas){
        this.baraja = new ArrayList<>();

        for (int i = 0; i < numcartas; i++) {
            
            boolean salir;
            Card carta = new Card();
            if (i == 0){
                baraja.add(carta);
            } else {
                do{
                    salir = false;
                    for (Card card : baraja) {
                        if (card.getTipo().equals(carta.getTipo()) && card.getValor() == carta.getValor()){
                            carta = new Card();
                            salir = true;
                        }
                    }
                }while(salir);
                baraja.add(carta);
            }
        }
    }

    public void imprimirCartasBaraja(){
        
        int sumaPts = 0;
        for (Card card : baraja) {
            
            System.out.println(cartaExpresion(card.getValor())+ " de " + card.getTipo());
            Valores valorCarta = new Valores(card.getValor());
            sumaPts += valorCarta.getValor();
        }

        System.out.println("Puntos totales: " + sumaPts);
    }

    private String cartaExpresion(int num){
        switch (num) {
            case 1:
                return "As";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10: 
                return "Sota";
            case 11:
                return "Caballo";
            case 12:
                return "Rey";
        
            default:
                return num+"";
        }
    }


}
