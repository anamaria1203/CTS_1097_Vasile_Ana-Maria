package decorator;

public class RezultatOnlineDecorator extends RezultatDecorator {
    public RezultatOnlineDecorator(IRezultate rezultate) {
        super(rezultate);
    }

    @Override
    public void afiseazaRezultate() {
        super.afiseazaRezultate();
        System.out.println("Rezultatele au fost trimise si online!");
    }
}
