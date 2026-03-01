import java.util.ArrayList;

public class Cuenta {
    private double saldo;
    private int numeroCuenta;
    ArrayList<String> movimientos;

    public Cuenta(int saldo) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta();
        this.movimientos = new ArrayList<>();
    }

    public Cuenta(){
        this.numeroCuenta = numeroCuenta();
        this.movimientos = new ArrayList<>();
    }

    public int numeroCuenta(){
        return (int)(Math.random()*10000)+ 10000;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void ingresar(double num){
        this.saldo += num;
        System.out.println("Se han ingresado " + num + "$\nSu saldo actual es de " + this.saldo + "$");
        System.out.println();
        movimientos.add("Se han ingresado " + num + "$");
    }

    public void retirar(int num){
        if (num > this.saldo){
            System.out.println("Lo sentimos su saldo actual es de " + this.saldo + "$");
        } else {
            this.saldo -= num;
            System.out.println("Se han retirado " + num + "$\nSu saldo actual es " + this.saldo);
            this.movimientos.add("Se han retirado " + num + "$");
        }
        System.out.println();
    }

    public void transferencia(Cuenta cuenta, double cantidad){
        this.saldo -= cantidad;
        cuenta.ingresar(cantidad);
        System.out.println("Transferencia realizada con exitito!\nSaldo restante " + this.saldo + "$");
        System.out.println();
        movimientos.add("Transferencia realizada a " + cuenta.numeroCuenta() + " de " + cantidad + "$");
    }

    public void movimientos(){
        
        if (movimientos.size() == 0){
            System.out.println("Aun no se ha hecho ningun movimiento en esta cuenta");
        } else {
            System.out.println("""
            MOVIMIENTOS
            ===========
            """);
            for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }
        }
        
    }


    
}
