package strategy;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }//in cerinta modu de plata se decide mai tarziu nu acum

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void plateste(){
        if(modPlata!=null){
            modPlata.plateste();
        }
        else{
            System.out.println("Nu s a ales un mod de plata");
        }
    }
}
