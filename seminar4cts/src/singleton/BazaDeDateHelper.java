package singleton;

public class BazaDeDateHelper {
    private String denumire;
    private int numarCampuri;

    public static class BazaDeDateInner{
        private static BazaDeDateHelper instanta = new BazaDeDateHelper();
    }

    private static BazaDeDateHelper instanta = null;

    public static synchronized BazaDeDateHelper getInstanta() {
        return BazaDeDateInner.instanta;
    }

    private BazaDeDateHelper() {
        this.denumire = "x";
        this.numarCampuri = 0;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateHelper{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}