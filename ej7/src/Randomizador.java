public class Randomizador {
    
    private boolean cara;
    private int valor;
    private String tipo;
    private int num = (int)(Math.random()*2) + 1;
    
    public Randomizador(){
        this.cara = cara();
        this.valor = valor();
        this.tipo = tipo();
    };

    private boolean cara(){
        int num = (int)(Math.random()*2) + 1;
        
        switch(num){
            case 1: 
                return true;
            case 2:
                return false;
        }
        return false;
    }

    private int valor(){
        switch(this.num){
            case 1:
                return (int)(Math.random()*50) + 50;
            case 2: 
                return (int)(Math.random()*50);
        }
        return 0;
    }

    private String tipo() {
        switch (this.num) {
            case 1:
                if (this.valor > 1 )
                return "Centimos";
                return "Centimo";
            case 2:
                if (this.valor > 1 )
                return "Euros";
                return "Euro";
        }
        return "";
    }

    public boolean getCara() {
        return cara;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
