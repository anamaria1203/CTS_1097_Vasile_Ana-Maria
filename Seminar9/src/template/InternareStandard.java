package template;

public class InternareStandard extends InternareTemplateMethod{
    @Override
    void analizeazStarePacienti() {
        System.out.println("se analizeaza starea ");
    }

    @Override
    void disponibilitateSaloane() {
        System.out.println("este disponibil");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("se emite fisa de internare");
    }
}
