package builder3;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient.BuilderPacient().setNume("Matei").setHalat(true).setPatRabatabil(true).buildPacient();
        System.out.println(pacient1);

        Pacient pacient2 = new Pacient.BuilderPacient().setNume("Alexandra").setPatRabatabil(true).setHalat(true).setPapuci(true).setMicDejun(true).buildPacient();
        System.out.println(pacient2);
    }
}
