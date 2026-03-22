package builder2;

public interface IBuilderPacient {
    Pacient buildPacient();
    IBuilderPacient setPatRabatabil(boolean arePatRabatabil);
    IBuilderPacient setMicDejun(boolean areMicDejun);
    IBuilderPacient setPapuci(boolean arePapuci);
    IBuilderPacient setHalat(boolean areHalat);
    IBuilderPacient setNume(String nume);
}
