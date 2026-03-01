import java.util.ArrayList;

public class Capturas {
    private ArrayList<Pieza> capturas;

    public Capturas(){
        this.capturas = new ArrayList<>();
        añadirPiezas();
    }

    private void añadirPiezas(){
        int num = (int)(Math.random()*16);
        for (int i = 0; i < num; i++) {
            Pieza pieza = new Pieza();
            while (!repes(pieza)) {
                pieza = new Pieza();
            }
            capturas.add(pieza);
        }
    }

    private boolean repes(Pieza pieza){
        int sum = 0;
        switch (pieza.getValor()) {
            case 9:
                for (Pieza p : capturas) {
                    if (p.getValor() == pieza.getValor()){
                        sum++;
                    }
                }
                return sum >= 1 ? false : true;
            case 5, 3, 2:
                for (Pieza p : capturas) {
                    if (p.getValor() == pieza.getValor()){
                        sum++;
                    }
                }
                return sum >= 2 ? false : true;
            case 1:
                for (Pieza p : capturas) {
                    if (p.getValor() == pieza.getValor()){
                        sum++;
                    }
                }
                return sum >= 8 ? false : true;
            default:
                break;
        }
        return false;
    }

    public void piezas(){
            for (Pieza pieza : capturas) {
                System.out.println(pieza.getTipo() + " " + pieza.getValor()+" pts");
            }
            puntuacion();
    }

    private void puntuacion(){
        int pts = 0;
        for (Pieza pieza : capturas) {
            pts += pieza.getValor();
        }
        System.out.println("Puntos totales: " + pts);
    }




}
