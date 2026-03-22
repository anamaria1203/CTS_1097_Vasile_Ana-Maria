package builder2;

public class Pacient {
    private final boolean arePatRabatabil;
    private final boolean areMicDejun;
    private final boolean arePapuci;
    private final boolean areHalat;
    private final String nume;

    protected Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuci, boolean areHalat, String nume) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuci=" + arePapuci +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }
}
