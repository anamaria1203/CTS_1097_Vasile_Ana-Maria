package factory;

public class FactoryMedic extends FactoryMethodPersonal{
    @Override
    public PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital) {
        return new Medic();
    }
}
