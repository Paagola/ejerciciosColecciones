

public class App {
    public static void main(String[] args) throws Exception {


        Baraja mazo = new Baraja(9);

        for (int i = 1; i <= mazo.getSize(); i++) {
            System.out.print(mazo.getCard(i)+ "\n");
        }
    }
}
