public class Corredor implements Comparable<Corredor>{
    private int segundos;

    public Corredor(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public int compareTo(Corredor o) {
        return Integer.compare(this.segundos, o.getSegundos());
    }

}
