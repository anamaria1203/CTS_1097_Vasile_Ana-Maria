package decorator;

public class Main {
    public static void main(String[] args) {
        IRezultate rezultatePrintate = new RezultatePrintate();
        IRezultate rezultateOnline = new RezultatOnlineDecorator(rezultatePrintate);
        rezultatePrintate.afiseazaRezultate();
        rezultateOnline.afiseazaRezultate();
        rezultatePrintate.afiseazaRezultate();
    }
}
