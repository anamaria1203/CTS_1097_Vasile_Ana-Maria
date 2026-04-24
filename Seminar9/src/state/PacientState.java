package state;

public class PacientState {
    private String nume;
    private Stari stari;

    public PacientState(String nume) {
        this.nume = nume;
        this.stari=new Internare();

    }
    public void setStari(Stari stari){
        this.stari=stari;
    }
    public void interneaza(){
        this.stari.interneaza();
    }
    public void trimitereSubObservatie(){
        this.stari.trecereSubObservatie();
    }
    public void externeaza(){
        this.stari.externeaza();
    }
}
