package prototype2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Solutie> solutii = new ArrayList<>();
        solutii.add(new Solutie("solutie1", 88.8));
        solutii.add(new Solutie("solutie2", 55.5));
        RetetaMedicament retetaMedicament = new RetetaMedicament("medicament1", solutii);
        RetetaMedicament copieRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();

        System.out.println(retetaMedicament == copieRetetaMedicament);
        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);

        System.out.println("----------------------");
        retetaMedicament.getSolutii().add(new Solutie("solutie3", 22.2));
        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);
    }
}