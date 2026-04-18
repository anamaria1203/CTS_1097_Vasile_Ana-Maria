package proxy;

public class Pacient {
    private String nume;
    private boolean asigurareSanatate;

    public Pacient(String nume, boolean asigurareSanatate) {
        this.nume = nume;
        this.asigurareSanatate = asigurareSanatate;
    }

    public String getNume() {
        return  this.nume;
    }

    public boolean isAsigurareSanatate() {
        return this.asigurareSanatate;
    }
}
