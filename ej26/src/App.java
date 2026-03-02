import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Liga<Equipo> futbol = new Liga<>("liga1");
        Liga<Corredor> atletismo = new Liga<>("liga2");

        futbol.inscribir("Madrid", new Equipo(20));
        futbol.inscribir("Barcelona", new Equipo(15));
        futbol.inscribir("Atletic", new Equipo(16));
        futbol.inscribir("Malaga", new Equipo(18));

        atletismo.inscribir("Juan", new Corredor(50));
        atletismo.inscribir("Marco", new Corredor(40));
        atletismo.inscribir("Alfredo", new Corredor(49));
        atletismo.inscribir("Curro", new Corredor(38));

        List<Equipo> clasifFutbol = futbol.clasificacion();
        List<Corredor> clasifAtletismo = atletismo.clasificacion();

        int clas = 1;
        for (Corredor corredor : clasifAtletismo) {
            System.out.println(clas + ". " + atletismo.get(corredor));
            clas++;
        }

        clas = 1;
        for (Equipo equipo : clasifFutbol) {
            System.out.println(clas + ". " + futbol.get(equipo));
            clas++;
        }
    }
}
