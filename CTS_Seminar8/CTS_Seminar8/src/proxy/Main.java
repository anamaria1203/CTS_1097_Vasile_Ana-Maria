package proxy;

public class Main {
    public static void main(String[] args) {
        ISpital spital = new Spital();
        ISpital spitalProxy = new SpitalProxy(spital);

        Pacient pacient1 = new Pacient("Ion", true);
        Pacient pacient2 = new Pacient("Popescu", false);

        spital.internare(pacient1);
        spital.internare(pacient2);

        spitalProxy.internare(pacient1);
        spitalProxy.internare(pacient2);
    }
}
