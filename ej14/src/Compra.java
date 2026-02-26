import java.util.HashMap;
import java.util.Map;

public class Compra {
    
    private HashMap<String, Integer> listaDeCompra;

    public Compra(){
        this.listaDeCompra = new HashMap<>();
    }

    public void añadiraLista(String producto, int cantidad){
        listaDeCompra.put(producto, cantidad);
    }

    public double calcularCompra(double precio, int cantidad){
        return precio * cantidad;
    }

   public void realizarCompra(ListaProductos inventario){
    double total = 0;
    
    for (Map.Entry<String, Integer> producto : listaDeCompra.entrySet()){
        int stockDisponible = inventario.buscarCantidadProducto(producto.getKey());
        
        if (stockDisponible >= producto.getValue()){
            double precio = inventario.buscarPrecioProducto(producto.getKey());
            total += calcularCompra(precio, producto.getValue());
            inventario.actualizarCantidad(producto.getKey(), producto.getValue());
        } else {
            compraNoRealizada();
        }
    }
    compraRealizada();
    productosComprados(inventario);
    System.out.println("Total de la compra: " + total + "$");
}
   
 
    public void compraRealizada(){
        System.out.println("Compra realizada con exito!!!");
    }

    public void compraNoRealizada(){
        System.out.println("La compra no se ha podido realizar por falta de stock");
    }

    public void productosComprados(ListaProductos inventario){
        for (Map.Entry<String, Integer> producto : listaDeCompra.entrySet()){
            double total =  calcularCompra(inventario.buscarPrecioProducto(producto.getKey()), producto.getValue());
            System.out.printf("%s   %10.2f   %d   %.2f \n", producto.getKey(), inventario.buscarPrecioProducto(producto.getKey()), producto.getValue(), total );
        }
        
    }

}
