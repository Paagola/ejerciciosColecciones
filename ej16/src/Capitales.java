public class Capitales {
    
    private Diccionario capitales;

    public Capitales() {
        this.capitales = new Diccionario();
        capitales.añadirEspFranPor();
    }

    public String buscarCapital(String pais){
        return capitales.buscarCapital(pais);
    }

    public String buscarPais(String capital){
        return capitales.buscarPais(capital);
    }

    public void añadirPaisCapital(String pais, String capital){
        capitales.añadirCapPais(pais, capital);

        if (capitales.buscarCapital(pais) != null) {
            System.out.println(pais + " con capital " + capital + " añadida con exito");
        } else {
            System.out.println("No se ha podido añadir su capital y pais.");
        }
    }






}
