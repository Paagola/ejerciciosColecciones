

public class App {
    public static void main(String[] args) throws Exception {

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta(1500);
        Cuenta cuenta3 = new Cuenta(6000);
        cuenta1.ingresar(2000);
        cuenta1.retirar(600);
        cuenta3.ingresar(75);
        cuenta1.retirar(55);
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.transferencia(cuenta3, 250);
        cuenta3.transferencia(cuenta1, 22);
        cuenta1.movimientos();

    }
}
