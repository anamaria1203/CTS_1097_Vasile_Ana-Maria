package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare = 10;

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAn_studii() {
		return anStudii;
	}

	public void setAn_studii(int an_studii) {
		this.anStudii = an_studii;
	}

	@Override
	public String toString() {
		return super.toString() + "Facultate= " + this.facultate + ", An studii=" + this.anStudii ;
	}

	@Override
	public void afisareFinantare() {
		super.afisareFinantare(Student.sumaFinantare, "Student");
	}
	
}
