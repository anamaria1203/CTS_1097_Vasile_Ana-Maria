package prototype;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements RetetaClonable{
    private String nume;
    private Map<String,Double> solutii;

    public RetetaMedicament(String nume, Map<String, Double> solutii) {
        this.nume = nume;
        this.solutii = new HashMap<>(solutii);
    }
    public RetetaMedicament(RetetaMedicament altaReteta){
        this.nume = altaReteta.nume;
        this.solutii = new HashMap<>(altaReteta.solutii);
    }

    public Map<String, Double> getSolutii() {
        return solutii;
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
