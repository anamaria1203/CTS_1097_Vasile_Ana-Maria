package state;

public class SubObservatie implements Stari{
    @Override
    public void interneaza() {
        System.out.println("nu mai e sub observatie dar tot e internat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("este deja dub observatie");
    }

    @Override
    public void externeaza() {
        System.out.println("va fi externat");
    }
}
