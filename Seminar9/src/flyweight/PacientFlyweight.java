package flyweight;

public class PacientFlyweight implements Flyweight{

    private Pacient pacient;

    public PacientFlyweight(Pacient pacient) {
        this.pacient = pacient;
    }


    @Override
    public void afisareetaliiInternare(Salon salon) {
        System.out.println(this.pacient+" "+ salon);

    }
}
