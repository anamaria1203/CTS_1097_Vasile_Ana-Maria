package adapter;

public class MedicamentAdaptor implements IMedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public MedicamentAdaptor(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Achizitia se face prin interfata noua a farmaciei.");
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
