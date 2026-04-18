package composite;

public class Sectie extends StructuraSpital{
    public Sectie(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaIerarhieSpital(String indentare) {
        System.out.println(indentare + super.getNume());
    }
}
