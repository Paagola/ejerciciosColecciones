import java.util.HashMap;
import java.util.Map;

public class ListaProductos {
    private HashMap<Producto, Integer> productos;

    public ListaProductos(){
        this.productos = new HashMap<>();
    }

    public void añadirProducto(Producto producto, int cantidad){
        productos.put(producto, cantidad);
    }

    public void getProductos(){
        for (Map.Entry<Producto, Integer> valor : productos.entrySet()) {
            System.out.println(valor.getKey().getNomProducto());
        }
    }

    public double buscarPrecioProducto(String producto){
    for (Map.Entry<Producto, Integer> valor : productos.entrySet()) {
        if (valor.getKey().getNomProducto().equals(producto)){
            return valor.getKey().getPrecio();
        }
    }
    return 0;
}


    public int buscarCantidadProducto(String producto){
        for (Map.Entry<Producto, Integer> valor : productos.entrySet()) {
            if (valor.getKey().getNomProducto().equals(producto)){
                return valor.getValue();
            }
        }
        
        return 0;
    }

    public void actualizarCantidad(String producto, int cantidadMenos){
        
        int cantidad = buscarCantidadProducto(producto);
        
        for (Map.Entry<Producto, Integer> valor : productos.entrySet()) {
            if (valor.getKey().getNomProducto().equals(producto)){
                productos.put(valor.getKey(), cantidad - cantidadMenos);
            }
        }
    }



}
