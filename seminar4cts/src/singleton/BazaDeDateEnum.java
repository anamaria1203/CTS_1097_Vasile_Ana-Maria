package singleton;

public enum BazaDeDateEnum {
    instanta;
    private String denumire;
    private int numarCampuri;


    public static BazaDeDateEnum getInstanta() {
        return instanta;
    }

    private BazaDeDateEnum() {
        this.denumire = "x";
        this.numarCampuri = 4;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateEnum{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}