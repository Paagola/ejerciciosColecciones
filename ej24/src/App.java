import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        HashMap<Jugador, String> liga = new HashMap<>();

        Jugador j1 = new Jugador("111", "Ninja", 1500);
        Jugador j2 = new Jugador("222", "Faker", 3000);
        Jugador j3 = new Jugador("333", "Ibai", 800);

        Jugador j4_duplicado = new Jugador("111", "NinjaFake", 9999); 

        // 2. Metemos los datos al mapa
        liga.put(j1, "Oro");
        liga.put(j2, "Diamante");
        liga.put(j3, "Bronce");
        liga.put(j4_duplicado, "Tramposo");

        System.out.println("Total de jugadores en el mapa: " + liga.size()); 
        System.out.println("-------------------------------------------------");

        ArrayList<Jugador> listaJugadores = new ArrayList<>(liga.keySet());


        Collections.sort(listaJugadores);

        for (Jugador jugador : listaJugadores) {
            String rango = liga.get(jugador);
            System.out.println(jugador.getNickname() + " tiene " + jugador.getPuntuacion() +
                                " pts" + " de rango " + rango );
        }

    }
}
