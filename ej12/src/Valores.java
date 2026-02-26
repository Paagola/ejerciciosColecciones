public class Valores {

    private int valor;

    public Valores(int valorEsp){
        switch (valorEsp) {
            case 1:
                this.valor = 11;
                break;
            case 3:
                this.valor =  10;
                break;
            case 10: 
                this.valor = 2;
                break;
            case 11:
                this.valor = 3;
                break;
            case 12:
                this.valor = 4;
                break;
            default:
                this.valor = 0;
                break;
        }
    }

    public int getValor() {
        return valor;
    }
}
