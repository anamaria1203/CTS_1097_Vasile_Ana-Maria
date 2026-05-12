package command;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void internarePacient(){
        System.out.println("Internare pacient");
    }

    public void internareImediata(){
        System.out.println("Internare imediata");
    }

    public String getNume() {
        return nume;
    }

    public void anuleazaInternarePacient(){
        System.out.println("Anuleaza internare pacient");
    }

    public void anuleazaTratareImediata(){
        System.out.println("Anuleaza tratare imediata");
    }

    public void refacereInternarePacient(){
        System.out.println("Refacere internare pacient");
    }

    public void refacereTratareImediara(){
        System.out.println("Refacere tratare imediata");
    }
}
