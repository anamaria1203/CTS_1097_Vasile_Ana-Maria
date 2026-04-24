package template;

public class Main {
    public static void main(String[] args) {
    InternareTemplateMethod standard=new InternareStandard();
    InternareTemplateMethod urgenta=new InternareUrgenta();
    standard.internare();
    urgenta.internare();

    }
}
