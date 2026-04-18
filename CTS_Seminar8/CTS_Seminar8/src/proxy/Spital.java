package proxy;

public class Spital implements ISpital {

    @Override
    public void internare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat!");
    }
}
