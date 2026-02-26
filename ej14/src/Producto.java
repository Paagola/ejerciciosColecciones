public class Producto {
    private String nomProducto;
    private double precio;

    public Producto(String nomProducto, double precio){
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public double getPrecio() {
        return precio;
    }


}
