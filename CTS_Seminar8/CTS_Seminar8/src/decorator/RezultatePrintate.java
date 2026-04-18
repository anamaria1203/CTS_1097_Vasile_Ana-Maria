package decorator;

public class RezultatePrintate implements IRezultate {
    @Override
    public void afiseazaRezultate() {
        System.out.println("Rezultatele au fost trimise printat.");
    }
}
