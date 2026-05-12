package command;

public class Main {
    public static void main(String[] args) {
        Medic medic1 = new Medic("Mihai");
        Command comenzi1 = new ComandaInternare(medic1, "Maria");
        Command comenzi2 = new ComandaInternare(medic1, "Ana");
        Command comenzi3 = new ComandaInternare(medic1, "Ala");

        OperatorTriaj operatorTriaj = new OperatorTriaj();
        operatorTriaj.adaugaComanda(comenzi1);
        operatorTriaj.adaugaComanda(comenzi2);
        operatorTriaj.adaugaComanda(comenzi3);

        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();

        operatorTriaj.anuleazaComanda();
        operatorTriaj.anuleazaComanda();
        operatorTriaj.anuleazaComanda();
        operatorTriaj.anuleazaComanda();

        operatorTriaj.refacereComanda();
        operatorTriaj.refacereComanda();






    }
}
