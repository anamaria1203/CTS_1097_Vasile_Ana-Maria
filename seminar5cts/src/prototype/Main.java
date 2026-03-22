package prototype;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RetetaMedicament retetaMedicament = new RetetaMedicament("medicament1",
                Map.of("solutie1",10.1, "solutie2",88.8));
        RetetaMedicament copieRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();

        System.out.println(retetaMedicament == copieRetetaMedicament);
        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);

        System.out.println("----------------------");
        retetaMedicament.getSolutii().put("solutie1",22.2);
        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);

    }
}
