package template;

public  abstract class InternareTemplateMethod {
    abstract void analizeazStarePacienti();
    abstract void disponibilitateSaloane();
    abstract void emitereFisaInternare();
     public void internare(){
         this.analizeazStarePacienti();
         this.disponibilitateSaloane();
         this.emitereFisaInternare();
     }
}
