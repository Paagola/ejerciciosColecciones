public class HabAlim {
    private String habitat;
    private String alimentacion;

    public HabAlim(String habitat, String alimentacion) {
        this.alimentacion = alimentacion;
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
