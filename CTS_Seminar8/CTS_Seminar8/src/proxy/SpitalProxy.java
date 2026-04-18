package proxy;

public class SpitalProxy implements ISpital {
    private Spital spital;

    public SpitalProxy(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void internare(Pacient pacient) {
        if (pacient.isAsigurareSanatate()) {
            spital.internare(pacient);
        } else {
            System.out.println("Pacientul nu are asigurare de sanatate!");
        }
    }
}
