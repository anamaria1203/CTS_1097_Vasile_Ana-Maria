package memento;

public class Autobuz {
    private String model;
    private int anFabricare;
    private int nrLocuri;
    private String numeSofer;
    private double consumMediu;

    public Autobuz(String model, int anFabricare, int nrLocuri, String numeSofer, double consumMediu) {
        this.model = model;
        this.anFabricare = anFabricare;
        this.nrLocuri = nrLocuri;
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public AutobuzMemento salvareMemento(){
        return new AutobuzMemento(this.numeSofer, this.consumMediu);
    }

    public void restaurareMemento(AutobuzMemento memento){
        this.numeSofer = memento.getNumeSofer();
        this.consumMediu = memento.getConsumMediu();
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", anFabricare=" + anFabricare +
                ", nrLocuri=" + nrLocuri +
                ", numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                '}';
    }
}
