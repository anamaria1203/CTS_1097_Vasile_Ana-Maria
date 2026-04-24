package state;

public class Internare implements Stari{
    @Override
    public void interneaza() {
        System.out.println("Pacientul deja este internat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("pacientul a fost trecut in starea de sub observatie");
    }

    @Override
    public void externeaza() {
        System.out.println("pacientul  va fi externat");
    }
}
