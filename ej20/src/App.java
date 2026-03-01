

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
                if (diccionario.buscar(option).tamaño() == 0 ){
                    System.out.println("No conozco ningun sinonimo de esa palabra");
                    String seguir = System.console().readLine("¿Deseas añadir un sinonimo? s/n -> ");
                    if (seguir.toLowerCase().equals("s")){

                        Sinonimos listaOriginal = diccionario.buscarLista(option);
                        String sinonimo = System.console().readLine("Nuevo sinónimo -> ");

                        if (listaOriginal != null) {
                            listaOriginal.añadir(sinonimo);
                        } else {
                            String ingles = System.console().readLine("¿Cuál es su traducción al inglés? -> ");
                            Sinonimos nuevaLista = new Sinonimos(option);
                            nuevaLista.añadir(sinonimo);
                            diccionario.añadir(nuevaLista, ingles);
                        }
                    }
                } else {
                    for (int i = 0; i < diccionario.buscar(option).tamaño(); i++) {
                        System.out.println(diccionario.buscar(option).pos(i) + " ");
                    }
                }
            }
        }while(salir);
    }
}
