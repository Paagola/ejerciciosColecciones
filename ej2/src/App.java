import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a2 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            a2.add((int)(Math.random()*101));
        }

        int suma = 0;
        int media = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (Integer a : a2) {
            suma += a;
            media++;
            maximo = Math.max(maximo, a);
            minimo = Math.min(minimo, a);
        }
        media = suma / media;

        System.out.println("ArrayList: " + a2);
        System.out.printf("""
                Suma -> %d
                Media -> %d
                Maximo -> %d
                Minimo -> %d
                """, suma, media, maximo, minimo);
        
    }
}
