package memento;

public class AutobuzMemento {
    private String numeSofer;
    private double consumMediu;

    public AutobuzMemento(String numeSofer, double consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public double getConsumMediu() {
        return consumMediu;
    }


}
