import java.util.HashMap;

public class Pieza {
    private int valor;
    private String tipo;

    public Pieza(){
        randomizar();
    }

    public void randomizar(){
        int num = (int)(Math.random()*5)+1;
        switch (num) {
            case 1:
                this.tipo = "dama";
                this.valor = 9;
                break;
            case 2:
                this.tipo = "torre";
                this.valor = 5;
                break;

            case 3:
                this.tipo = "alfil";
                this.valor = 3;
                break;

            case 4:
                this.tipo = "caballo";
                this.valor = 2;
                break;
            
            case 5:
                this.tipo = "peon";
                this.valor = 1;
                break;
        
            default:
                break;
        }
    }

    public int getValor(){
        return this.valor;
    }

    public String getTipo() {
        return tipo;
    }

}
