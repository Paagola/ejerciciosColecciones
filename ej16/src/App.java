

public class App {
    public static void main(String[] args) throws Exception {
        Capitales diccionario = new Capitales();

        boolean salir = true;

       do{
            menu();
            int opcion = Integer.parseInt(System.console().readLine("-> "));

            switch (opcion) {
                case 1:
                    String pais = System.console().readLine("Introduzca país: ");
                    
                    if (diccionario.buscarCapital(pais) != null){
                        System.out.println("La capital de " + pais + " es " + diccionario.buscarCapital(pais) + "\n");
                    } else {

                        System.out.println("No se ha encontrado ninguna capital de ese pais");
                        String añadir = System.console().readLine("¿Desa añadir este pais? s/n -> ");
                        if (añadir.toLowerCase().equals("s")){
                            String capital = System.console().readLine("Introduzca al capital de " + pais + " -> ");
                            diccionario.añadirPaisCapital(pais, capital);
                        }
                    }
                    break;
                case 2:
                    String capital = System.console().readLine("Introduzca capital: ");
                    
                    if (diccionario.buscarPais(capital) != null){
                        System.out.println("El pais de " + capital + " es "+ diccionario.buscarPais(capital) + "\n");
                    } else {

                        System.out.println("No se ha encontrado ningun pais de esa capital");
                        String añadir = System.console().readLine("¿Desa añadir esta capital? s/n -> ");
                        if (añadir.toLowerCase().equals("s")){
                            pais = System.console().readLine("Introduzca al capital de " + capital + " -> ");
                            diccionario.añadirPaisCapital(pais, capital);
                        }
                    }
                    break;
                case 3:
                    pais = System.console().readLine("Pais -> ");    
                    capital = System.console().readLine("Capital -> ");
                    
                    diccionario.añadirPaisCapital(pais, capital);
                    break;
                case 4:
                    salir = false;
                    break;
            
                default:
                    break;
            }
        

        }while(salir);
    }

    public static void menu(){
        System.out.println("""
                1. Buscar capital por pais
                2. Bucar pais por capital
                3. Añadir nuevo pais y capital
                4. Salir
                """);
    }
}
