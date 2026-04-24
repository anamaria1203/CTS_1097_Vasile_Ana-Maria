package strategy;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1=new Pacient("Ion");
        pacient1.plateste();
        pacient1.setModPlata(new PlataCard());
        pacient1.plateste();
        pacient1.setModPlata(new PlataCash());
        pacient1.plateste();
    }
}
