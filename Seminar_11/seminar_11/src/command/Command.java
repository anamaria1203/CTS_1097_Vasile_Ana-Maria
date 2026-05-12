package command;

public abstract class Command {
    private String numePacient;
    private Medic medic;

    public Command(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public Medic getMedic() {
        return medic;
    }

    public abstract void executa();
    public abstract void undo();
    public  abstract void redo();

}
