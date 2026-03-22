package prototype2;

import java.util.ArrayList;
import java.util.List;


public class RetetaMedicament implements RetetaClonable {
    private String nume;
    private List<Solutie> solutii;

    public RetetaMedicament(String nume, List<Solutie> solutii) {
        this.nume = nume;
        this.solutii = new ArrayList<>(solutii);
    }
    public RetetaMedicament(RetetaMedicament altaReteta) {
        this.nume = altaReteta.nume;
        List<Solutie>  copieLista = new ArrayList<>();
        for(Solutie solutie : altaReteta.solutii){
            copieLista.add((Solutie) solutie.clone());
        }
        this.solutii =new ArrayList<>(copieLista);

    }

    public ArrayList<Solutie> getSolutii() {
        return (ArrayList<Solutie>) solutii;
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }

    @Override
    public RetetaClonable cloneaza() {
        return new RetetaMedicament(this);
    }
}
