import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private String id;
    private String nickname;
    private int puntuacion;

    public Jugador(String id, String nickname, int puntuacion) {
        this.id = id;
        this.nickname = nickname;
        this.puntuacion = puntuacion;

    }

    public String getNickname() {
        return nickname;
    }


    public int getPuntuacion() {
        return puntuacion;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public int compareTo(Jugador o) {
        return Integer.compare(o.getPuntuacion(), puntuacion);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj ) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Jugador jugador = (Jugador) obj;

        return Objects.equals(id, jugador.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
