

public class App {
    public static void main(String[] args) throws Exception {


        Baraja mazo = new Baraja(48);

        for (int i = 1; i <= mazo.getSize(); i++) {
            System.out.print(mazo.getCard(i)+ "\n");
        }

        System.out.println("\nBaraja ordenada\n============\n");

        mazo.ordenadarBaraja();

         for (int i = 1; i <= mazo.getSize(); i++) {
            System.out.print(mazo.getCard(i)+ "\n");
        }
    }
}
