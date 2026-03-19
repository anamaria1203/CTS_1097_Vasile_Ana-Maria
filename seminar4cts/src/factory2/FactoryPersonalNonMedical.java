package factory2;

public class FactoryPersonalNonMedical extends FactoryPersonal{
    @Override
    public PersonalSpital getPersonal(TipPersonalNonMedical tipPersonalNonMedical) {
        switch (tipPersonalNonMedical) {
            case TipPersonalNonMedical.Secretar -> {
                return new Secretar();
            }
            case TipPersonalNonMedical.Registrator -> {
                return new Registrator();
            }
            default -> {
                return null;
            }
        }
    }
}
