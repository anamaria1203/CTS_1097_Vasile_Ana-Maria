package factory2;

import factory2.Asistent;
import factory2.Brancardier;
import factory2.Medic;
import factory2.TipPersonalSpital;

public class FactoryPersonalMedical extends FactoryPersonal{
    @Override
    public PersonalSpital getPersonal(TipPersonalMedical tipPersonalMedical) {
        switch (tipPersonalMedical) {
            case TipPersonalMedical.Asistent -> {
                return new Asistent();
            }
            case TipPersonalMedical.Medic -> {
                return new Medic();
            }
            case TipPersonalMedical.Brancardier -> {
                return new Brancardier();
            }
            default -> { return null;}
        }
    }
}
