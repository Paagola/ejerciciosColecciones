public class Carta {
    private int numero;
    private String tipo;

    Carta(){
        this.numero = numero();
        this.tipo = tipo();
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int numero() {
        return (int)(Math.random()*12)+1;
    }

    public String tipo(){
        int ran = (int)(Math.random()*4)+1;

        switch (ran) {
            case 1:
                return "Oro";
            case 2:
                return "Copas";
            case 3:
                return "Espadas";
            case 4:
                return "Bastos";
        } 
        return null;
    }

    @Override
    public String toString() {
        return this.numero + " " + this.tipo;
    }
}
