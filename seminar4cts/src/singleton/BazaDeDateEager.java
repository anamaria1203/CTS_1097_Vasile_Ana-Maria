package singleton;

public class BazaDeDateEager {
    private String denumire;
    private int numarCampuri;

    private static final BazaDeDateEager instanta = new BazaDeDateEager ("Baza",2);

    public static BazaDeDateEager getInstanta() {
        return instanta;
    }

    private BazaDeDateEager(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateEager{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}