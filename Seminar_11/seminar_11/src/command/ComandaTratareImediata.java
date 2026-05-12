package command;

public abstract class ComandaTratareImediata extends Command{

    public ComandaTratareImediata(Medic medic, String numePacient) {
        super(medic, numePacient);
    }

    @Override
    public void executa() {
    }
}
