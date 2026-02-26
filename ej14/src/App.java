import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ListaProductos productos = new ListaProductos();

        productos.añadirProducto(new Producto("avena", 2.21), 2);
        productos.añadirProducto(new Producto("garbanzos", 2.39), 5);
        productos.añadirProducto(new Producto("tomate", 1.59), 10);
        productos.añadirProducto(new Producto("jengibre", 3.13), 7);
        productos.añadirProducto(new Producto("quinoa", 4.50), 9);
        productos.añadirProducto(new Producto("guisantes", 1.60), 1);

        boolean salir = true;

        System.out.println("Introduce la palabra 'fin' para dejar de comprar");

        Compra compra = new Compra();
        do{
            String producto = System.console().readLine("Producto: ");
            if (producto.equals("fin")){
                salir = false;
            } else {
                int cantidad = Integer.parseInt(System.console().readLine("Cantidad: "));
                compra.añadiraLista(producto, cantidad);
            }

        }while(salir);

        compra.realizarCompra(productos);
    }
}
