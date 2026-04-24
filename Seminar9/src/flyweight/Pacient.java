package flyweight;

public class Pacient {
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "PacientFlyweight{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
