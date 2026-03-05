package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantare = 30;

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public Elev() {
		super();
	}
	
	public int getClasa() {
		return clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return this.tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: Nume=" + this.nume + ", Prenume=" + this.prenume + ", Varsta="
				+ this.varsta + ", Punctaj=" + this.punctaj + ", Nr_proiecte="
				+ this.numarProiecte  + ", DenumireProiect="
				+ Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}


	@Override
	public void afisareFinantare(){
		super.afisareFinantare(sumaFinantare, "Elev");
	}
	
}
