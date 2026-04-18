package composite;

public class Main {
    public static void main(String[] args) {
        Sectie dermatologie = new Sectie("dermatologie");
        Sectie cardiologie = new Sectie("cardiologie");
        Sectie pediatrie = new Sectie("pediatrie");

        Departament departamentAdulti = new Departament("adulti");
        Departament departamentCopii = new Departament("copii");
        Departament spital = new Departament("spital");

        departamentAdulti.adaugaStructura(dermatologie);
        departamentAdulti.adaugaStructura(cardiologie);
        departamentCopii.adaugaStructura(pediatrie);

        spital.adaugaStructura(departamentAdulti);
        spital.adaugaStructura(departamentCopii);

        spital.afiseazaIerarhieSpital("  ");
    }
}
