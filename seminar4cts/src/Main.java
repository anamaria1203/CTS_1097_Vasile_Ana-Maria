import factory.PersonalFactory;
import factory.PersonalSpital;
import factory.TipPersonalSpital;
import factory2.FactoryPersonalMedical;
import factory2.TipPersonalMedical;
import factory2.TipPersonalNonMedical;
import singleton.BazaDeDateEnum;

public class Main {
    public static void main(String[] args) {
        BazaDeDateEnum instanta = BazaDeDateEnum.instanta;
        System.out.println(instanta);
        BazaDeDateEnum instanta2 = BazaDeDateEnum.instanta;
        System.out.println(instanta2);
        if(instanta == instanta2) {
            System.out.println(true);
        }

        PersonalSpital medic =  PersonalFactory.getPersonal(TipPersonalSpital.Medic);
        medic.afiseaza();
        PersonalSpital asistent =  PersonalFactory.getPersonal(TipPersonalSpital.Asistent);
        asistent.afiseaza();

        factory2.FactoryPersonal factoryPersonalMedical = new FactoryPersonalMedical();
        factory2.PersonalSpital medic2 = factoryPersonalMedical.getPersonal(TipPersonalMedical.Medic);
        medic2.afiseaza();

        factory2.FactoryPersonal factoryPersonalNonMedical = new FactoryPersonalMedical();
        factory2.PersonalSpital secretar = factoryPersonalNonMedical.getPersonal(TipPersonalNonMedical.Secretar);
        secretar.afiseaza();

    }
}