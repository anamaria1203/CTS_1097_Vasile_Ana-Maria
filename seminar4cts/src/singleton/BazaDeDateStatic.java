package singleton;
public class BazaDeDateStatic {
    private String denumire;
    private int numarCampuri;
    private static BazaDeDateStatic instanta;
    static {
        try {
            instanta = new BazaDeDateStatic("Baza1",2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BazaDeDateStatic(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    public static BazaDeDateStatic getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        return "BazaDeDateStatic{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}