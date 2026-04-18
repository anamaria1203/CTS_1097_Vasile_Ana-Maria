package composite;

import java.util.StringJoiner;

public abstract class StructuraSpital {
    private String nume;

    public StructuraSpital(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaIerarhieSpital(String indentare);
    public void adaugaStructura(StructuraSpital structuraSpital){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StructuraSpital.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .toString();
    }

    public void stergeStructura(StructuraSpital structuraSpital){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public String getNume(){
        return this.nume;
    }

    public  StructuraSpital getStructuraSpital(int index){
        throw new UnsupportedOperationException("Not suported yet.");
    }
}
