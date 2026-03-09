package cts.s02.principii_clean_code.main;

import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;
import cts.s02.principii_clean_code.readers.AngajatReader;
import cts.s02.principii_clean_code.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		try {
			List<Angajat> listaAngajati;
			AplicantReader reader = new AngajatReader() {
				@Override
				public List<Student> citireAplicant(String numeFisier) {
					return java.util.Collections.emptyList();
				}

				@Override
				public List<Aplicant> citireAplicant() {
					return java.util.Collections.emptyList();
				}
			};
			listaAngajati = reader.citireAplicanti("angajati.txt");
			for (Aplicant aplicant : listaAngajati)
				System.out.println(aplicant.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}