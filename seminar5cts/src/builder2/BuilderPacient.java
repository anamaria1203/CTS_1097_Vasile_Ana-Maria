package builder2;

public class BuilderPacient implements IBuilderPacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String nume;

    public BuilderPacient() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuci = false;
        this.areHalat = false;
        this.nume = "Anonim";

    }

    @Override
    public Pacient buildPacient() {
        return new Pacient(this.arePatRabatabil,this.areMicDejun,this.areHalat,this.arePapuci, this.nume);
    }

    @Override
    public IBuilderPacient setPatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public IBuilderPacient setMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    @Override
    public IBuilderPacient setPapuci(boolean arePapuci) {
        this.arePatRabatabil = arePapuci;
        return this;
    }

    @Override
    public IBuilderPacient setHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.nume = nume;
        return this;
    }
}
