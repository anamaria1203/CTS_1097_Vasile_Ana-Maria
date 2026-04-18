package facade;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(int numarPacient) {
        Pacient pacient = this.medic.getPacienti().get(numarPacient);
        if (!this.medic.decideInternare(numarPacient)) {
            System.out.println("Pacientul nu are o stare grava. Nu trebuie internat.");
            return;
        }
        System.out.println("Pacientul are o stare grava. Acesta trebuie internat.");
        if (!this.salon.arePaturiLibere()) {
            System.out.println("Nu exista paturi libere!");
            return;
        }
        int numarPat = this.salon.ocupaPrimulPatLiber();
        System.out.println("Pacientul " + pacient.getNumar() + " a fost internat pe patul numarul " + numarPat + ".");
    }
}
