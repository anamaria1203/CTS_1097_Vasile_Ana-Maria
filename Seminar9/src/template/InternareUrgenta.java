package template;

public class InternareUrgenta extends InternareTemplateMethod{
    @Override
    void analizeazStarePacienti() {
        System.out.println("se analizeaza starea pacientului");
    }

    @Override
    void disponibilitateSaloane() {
        System.out.println("este valabbil");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("s a emis fisa de internare");
    }
}
