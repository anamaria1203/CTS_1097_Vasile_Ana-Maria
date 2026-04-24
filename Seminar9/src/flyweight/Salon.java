package flyweight;

public class Salon {
    private int numarSalon;
    private int numarPret;
    private int numarZile;

    public Salon(int numarSalon, int numarPret, int numarZile) {
        this.numarSalon = numarSalon;
        this.numarPret = numarPret;
        this.numarZile = numarZile;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "numarSalon=" + numarSalon +
                ", numarPret=" + numarPret +
                ", numarZile=" + numarZile +
                '}';
    }
}
