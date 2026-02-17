public class Moneda {
    private int valor;
    private String tipo;
    private boolean cara;

    public Moneda(int valor, String tipo, boolean cara){
        this.valor = valor;
        this.tipo = tipo;
        this.cara = cara;
    }

    //getters y setters
    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public boolean getCara() {
        return cara;
    }
}
