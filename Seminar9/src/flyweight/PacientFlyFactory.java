package flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacientFlyFactory {
    private static Map<String,Flyweight> flyweight=new HashMap<>();



    public PacientFlyFactory() {
        this.flyweight=new HashMap<>();
    }

    public static Flyweight getFlyweightList(String nume, String numarTelefon, String adresa){
        if(!flyweight.containsKey(numarTelefon)){
            flyweight.put(numarTelefon, new PacientFlyweight(new Pacient(nume, numarTelefon, adresa)));
        }
        return flyweight.get(numarTelefon);
    }

}
