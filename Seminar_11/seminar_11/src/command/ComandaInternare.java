package command;

public class ComandaInternare extends Command {

    public ComandaInternare(Medic medic, String numePacient) {
        super(medic, numePacient);
    }

    @Override
    public void executa() {
        getMedic().internarePacient();
    }

    @Override
    public void undo() {
        getMedic().anuleazaInternarePacient();
    }

    @Override
    public void redo() {
        getMedic().refacereInternarePacient();
    }
}