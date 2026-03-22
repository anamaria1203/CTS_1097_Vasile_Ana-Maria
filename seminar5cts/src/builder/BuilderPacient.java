package builder;

public class BuilderPacient implements IBuilderPacient{
    private Pacient pacient;

    public BuilderPacient() {
        this.pacient =  new Pacient();
    }

    @Override
    public Pacient buildPacient() {
        return this.pacient;
    }

    @Override
    public IBuilderPacient setPatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public IBuilderPacient setMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    @Override
    public IBuilderPacient setPapuci(boolean arePapuci) {
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    @Override
    public IBuilderPacient setHalat(boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.pacient.setNume(nume);
        return this;
    }
}
