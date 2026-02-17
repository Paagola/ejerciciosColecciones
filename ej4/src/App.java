import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a4 = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String palabra = System.console().readLine("Palabra " + (i+1)+ " -> ");
            a4.add(palabra);
        }

        System.out.println(a4);
        Collections.sort(a4);
        System.out.println(a4);
    }
}
