package prototype2;

public class Solutie implements Cloneable{
    private String nume;
    private Double cantitate;

    public Solutie(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Solutie{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }

    @Override
    protected Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Double getCantitate() {
        return cantitate;
    }
}
