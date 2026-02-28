import java.util.ArrayList;

public class Carrito {
    public ArrayList<Elemento> carrito;

    public Carrito() {
        this.carrito = new ArrayList<>();
    }

    public void agrega(Elemento elemento){
        carrito.add(elemento);
    }

    public int numeroDeElementos(){
        return carrito.size();
    }

    public double importeTotal() {
        double sum = 0;
        for (Elemento elemento : carrito) {
            sum += (elemento.getPrecio() * elemento.getCantidad());
        }
        return sum;
    }

    public void elementosCarrito(){
        for (Elemento elemento : carrito) {
            System.out.print(elemento.getNomProducto() +", ");
        }
        System.out.println();
    }
}
