package adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("medicament1");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        IMedicamentFarmacie medicamentAdaptor = new MedicamentAdaptor(medicamentSpital);
        List<IMedicamentFarmacie> medicamente = List.of(medicamentFarmacie, medicamentAdaptor);
        medicamente.forEach(IMedicamentFarmacie::cumparaMedicament);
    }
}
