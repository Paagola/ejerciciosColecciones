public class Equipo implements Comparable<Equipo>{
    private int puntos;

    public Equipo(int puntos){
        this.puntos = puntos;
    }
    
    public int getPuntos() {
        return puntos;
    }

    @Override
    public int compareTo(Equipo o) {
        return Integer.compare(o.getPuntos(), puntos);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
