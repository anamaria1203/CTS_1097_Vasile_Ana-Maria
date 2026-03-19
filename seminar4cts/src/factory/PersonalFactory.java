package factory;

public class PersonalFactory {
    public static PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital) {
        switch (tipPersonalSpital) {
            case TipPersonalSpital.Asistent -> {
                return new Asistent();
            }
            case TipPersonalSpital.Medic -> {
                return new Medic();
            }
            case TipPersonalSpital.Bancardier -> {
                return new Brancardier();
            }
            default -> { return null;}
        }
    }
}
