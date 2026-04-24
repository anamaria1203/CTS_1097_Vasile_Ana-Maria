package state;

public class Main {
    public static void main(String[] args) {
        PacientState pacientState1=new PacientState("Petru");

        pacientState1.interneaza();
        pacientState1.setStari(new SubObservatie());
        pacientState1.trimitereSubObservatie();
        pacientState1.setStari(new Externare());
        pacientState1.externeaza();
    }
}
