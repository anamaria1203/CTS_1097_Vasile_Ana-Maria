package state;

public class Externare implements Stari{
    @Override
    public void interneaza() {
        System.out.println("s a reinternat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("nu e posibil fiindca nu e internat");
    }

    @Override
    public void externeaza() {
        System.out.println("este daj externat");
    }
}
