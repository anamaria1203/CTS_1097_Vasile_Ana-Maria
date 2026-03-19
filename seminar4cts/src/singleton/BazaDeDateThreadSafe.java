package singleton;

public class BazaDeDateThreadSafe {
    private String denumire;
    private int numarCampuri;

    private static BazaDeDateThreadSafe instanta = new BazaDeDateThreadSafe ("Baza",2);

    public static synchronized BazaDeDateThreadSafe getInstanta(String denumire, int numarCampuri) {
        if ( instanta == null){
            instanta = new BazaDeDateThreadSafe(denumire,numarCampuri);
        }
        return instanta;
    }

    private BazaDeDateThreadSafe(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateThreadSafe{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}