

public class App {
    public static void main(String[] args) throws Exception {
        ListaAnfibios anfibios = new ListaAnfibios();
        anfibios.añadir("rana", "en los tropicos y cerca de las zonas humedas y acuaticas", "larvas e insectos");
        anfibios.añadir("salamandra", "ecosistemas húmedos", "pequeños crustaceos e insectos");
        anfibios.añadir("sapo", "en cualquier sitio salvo el desierto y la Antartida", "insectos, lombrices y pequeños roedores");

        boolean salir = true;

        do{
            String option = System.console().readLine("Introduzca el tipo de anfibio: ");
            if (option.equals("salir")){
                salir = false;
            } else {
                anfibios.buscar(option);
            }
        }while(salir);

    }
}
