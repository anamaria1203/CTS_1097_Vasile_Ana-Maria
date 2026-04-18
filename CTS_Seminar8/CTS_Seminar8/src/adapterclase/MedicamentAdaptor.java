package adapterclase;

public class MedicamentAdaptor extends MedicamentSpital implements IMedicamentFarmacie {

    public MedicamentAdaptor(String numeMedicamentSpital) {
        super(numeMedicamentSpital);
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Achizitia se face prin interfata noua a farmaciei.");
        super.achizitioneazaMedicament();
    }
}
