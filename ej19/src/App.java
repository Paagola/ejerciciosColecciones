

public class App {
    public static void main(String[] args) throws Exception {
        Diccionario diccionario = new Diccionario();
        diccionario.añadir(new Sinonimos("caliente", "ardiente", "abrasador"), "hot");
        diccionario.añadir(new Sinonimos("rojo"), "red");
        diccionario.añadir(new Sinonimos("verde"), "green");
        diccionario.añadir(new Sinonimos("agujetas"), "stiff");
        diccionario.añadir(new Sinonimos("hierro"), "iron");

        
        boolean salir = true;


        do{
            String option = System.console().readLine("Introduzca una palabra y le daré los sinónimos: ");

            if (option.equals("salir")){
                salir = false;
            } else {
                diccionario.buscar(option);
            }

        }while(salir);
    }
}
