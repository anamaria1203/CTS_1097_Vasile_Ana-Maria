package builder;

public class Main {
    public static void main(String[] args) {
        IBuilderPacient builder = new BuilderPacient();
        Pacient pacient1 = builder.setNume("Matei").setHalat(true).setPatRabatabil(true).buildPacient();
        System.out.println(pacient1);
        Pacient pacient2 = builder.setNume("Alexandra").setPatRabatabil(true).setHalat(true).setPapuci(true).setMicDejun(true).buildPacient();
        System.out.println(pacient2);


    }
}