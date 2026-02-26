

public class App {
    public static void main(String[] args) throws Exception {
        Diccionario diccionario = new Diccionario();

        diccionario.añadirPalabra("Hola", "Hello");
        diccionario.añadirPalabra("Manzana", "Apple");
        diccionario.añadirPalabra("Gusano", "Worm");
        diccionario.añadirPalabra("Llave", "Key");
        diccionario.añadirPalabra("Puerta", "Door");

        System.out.println(diccionario.buscarTradEspañol("Gusano"));
        System.out.println(diccionario.buscarTradIngles("Key"));
    }
}
