

public class App {
    public static void main(String[] args) throws Exception {
        Diccionario diccionario = new Diccionario();

        diccionario.añadirPalabra("Hola", "Hello");
        diccionario.añadirPalabra("Manzana", "Apple");
        diccionario.añadirPalabra("Gusano", "Worm");
        diccionario.añadirPalabra("Llave", "Key");
        diccionario.añadirPalabra("Puerta", "Door");
        diccionario.añadirPalabra("Hijo", "Son");
        diccionario.añadirPalabra("Mesa", "Table");
        

        Randomizador palabrasRandom = new Randomizador();
        palabrasRandom.ListaPalabrasRandomizadas(diccionario);

        for (int i = 0; i < palabrasRandom.tamaño() ; i++) {
            System.out.println("Palabra a Traducir: "+palabrasRandom.getPos(i));
            String buscarTrad = System.console().readLine("Traduccion en ingles: ");
            if (!diccionario.buscarTradEspañol(palabrasRandom.getPos(i).toString()).equals(buscarTrad)){
                System.out.println("No, la traduccion correcta es " + diccionario.buscarTradEspañol(palabrasRandom.getPos(i)) + "\n");
            } else {
                System.out.println("Muy bien!!!\n");
            }
        }
    }
}
