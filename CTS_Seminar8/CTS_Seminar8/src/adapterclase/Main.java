package adapterclase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("medicament1");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        IMedicamentFarmacie medicamentAdaptor = new MedicamentAdaptor("medicament spital");
        List<IMedicamentFarmacie> medicamente = List.of(medicamentFarmacie, medicamentAdaptor);
        medicamente.forEach(IMedicamentFarmacie::cumparaMedicament);
    }
}
