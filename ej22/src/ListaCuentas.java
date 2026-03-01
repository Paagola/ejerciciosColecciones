import java.util.ArrayList;

public class ListaCuentas {
    ArrayList<Cuenta> lista;

    public ListaCuentas() {
        this.lista = new ArrayList<>();
    }

    public void añadir(Cuenta cuenta){
        this.lista.add(cuenta);
    }

    

}
