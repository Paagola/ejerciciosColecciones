public class Elemento {
    private double precio;
    private int cantidad;
    private String nomProducto;

    public Elemento(String nomProducto, double precio, int cantidad){
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
