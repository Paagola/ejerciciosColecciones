import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Marco");
        a1.add("Curro");
        a1.add("Juanma");
        a1.add("Juan");
        a1.add("Jazmin");
        a1.add("Pepe");

        for (String a : a1) {
            System.out.print(a + " ");
        }
    }
}
