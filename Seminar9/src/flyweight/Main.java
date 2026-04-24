package flyweight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Salon salon1= new Salon(12, 10, 4);
         Salon salon2= new Salon(17, 56, 8);
         Salon salon3= new Salon(14, 100, 27);

        Flyweight pacient= PacientFlyFactory.getFlyweightList("Mihai","436986563","Strada ANA BOS");
        pacient.afisareetaliiInternare(salon1);
        pacient.afisareetaliiInternare(salon2);
        pacient.afisareetaliiInternare(salon3);
    }
}

