package builder3;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String nume;

    private Pacient(BuilderPacient builder) {
        this.arePatRabatabil = builder.arePatRabatabil;
        this.areMicDejun = builder.areMicDejun;
        this.arePapuci = builder.arePapuci;
        this.areHalat = builder.areHalat;
        this.nume = builder.nume;
    }

    @Override
    public String toString() {
        return "Pacient: " + nume +
                " | Pat rabatabil: " + arePatRabatabil +
                " | Mic dejun: " + areMicDejun +
                " | Papuci: " + arePapuci +
                " | Halat: " + areHalat;
    }

    public static class BuilderPacient {
        private boolean arePatRabatabil;
        private boolean areMicDejun;
        private boolean arePapuci;
        private boolean areHalat;
        private String nume;

        public BuilderPacient() {
            this.arePatRabatabil = false;
            this.areMicDejun = false;
            this.arePapuci = false;
            this.areHalat = false;
            this.nume = "Anonim";
        }

        public Pacient buildPacient() {
            return new Pacient(this);
        }

        public BuilderPacient setPatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return this;
        }

        public BuilderPacient setMicDejun(boolean areMicDejun) {
            this.areMicDejun = areMicDejun;
            return this;
        }

        public BuilderPacient setPapuci(boolean arePapuci) {
            this.arePapuci = arePapuci;
            return this;
        }

        public BuilderPacient setHalat(boolean areHalat) {
            this.areHalat = areHalat;
            return this;
        }

        public BuilderPacient setNume(String nume) {
            this.nume = nume;
            return this;
        }
    }
}