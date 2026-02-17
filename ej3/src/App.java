import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a3 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int numero = Integer.parseInt(System.console().readLine("Num " + (i+1)+ " -> "));
            a3.add(numero);
        }

        System.out.println(a3);
        Collections.sort(a3);
        System.out.println(a3);
    }
}
