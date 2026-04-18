package facade;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Popescu", List.of(new Pacient(0, "Pacient0", 1),
                                                         new Pacient(1, "Pacient1", 3),
                                                         new Pacient(2, "Pacient2", 3)));
        Salon salon = new Salon(1);
        SpitalFacade facade =  new SpitalFacade(medic, salon);
        facade.internarePacient(0);
        facade.internarePacient(1);
        facade.internarePacient(2);
    }
}
