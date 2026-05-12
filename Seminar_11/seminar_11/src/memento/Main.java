package memento;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Mercedes", 2020, 30, "Alex", 6.5);

        System.out.println(a1);
        AutobuzMemento autobuzmemento = a1.salvareMemento();
        a1.setNumeSofer("ana");
        a1.setConsumMediu(46.6);
        System.out.println(a1);

        a1.restaurareMemento(autobuzmemento);
        System.out.println(a1);

    }
}
