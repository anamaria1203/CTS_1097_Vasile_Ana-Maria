package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    private List<AutobuzMemento> mementos;

    public ManagerAutobuze() {
        mementos = new ArrayList<>();
    }

    public void adaugaMemento(AutobuzMemento memento){
        mementos.add(memento);
    }

    public AutobuzMemento getMemento(int index){
        return mementos.get(index);
    }
    public AutobuzMemento getLastMemento(){
        return mementos.getLast();

    }
}
