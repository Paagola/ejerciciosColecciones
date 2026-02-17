import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a4 = new ArrayList<String>();

        while (true) {
            menu();
            int numero = Integer.parseInt(System.console().readLine("-> "));
            switch (numero) {
                case 1:
                    boolean salir = false;
                    do {
                        String disco = System.console().readLine("Introduce nombre de disco: ");
                        a4.add(disco);
                        String choice = System.console().readLine("¿Desea introducir otro disco? s/n");
                        if (choice.toLowerCase().equals("n")) {
                            salir = true;
                        }
                    } while (!salir);
                    break;

                case 2:
                    if (a4.size() == 0) {
                        System.out.println("No hay ningun disco aun");
                    } else {
                        System.out.println("Numero de discos actuales: " + a4.size());
                        for (String a : a4) {
                            System.out.print(a + " | ");
                        }
                        System.out.println();
                    }

                default:
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("""
                1. Añadir disco
                2. Lista de discos
                """);
    }
}
