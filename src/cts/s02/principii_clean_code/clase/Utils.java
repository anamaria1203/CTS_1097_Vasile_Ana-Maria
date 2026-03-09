package cts.s02.principii_clean_code.clase;

import cts.s02.principii_clean_code.readers.AngajatReader;
import cts.s02.principii_clean_code.readers.StudentReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	public static List<Elev> readPupil(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",|\n");
		List<Elev> elevi = new ArrayList<>();

		while (input2.hasNext()) {
			String nume = input2.next();
			String prenume = input2.next();
			int varsta = input2.nextInt();
			int punctaj = input2.nextInt();
			int nr = input2.nextInt();
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input2.next();
			int clasa = input2.nextInt();
			String tutore = input2.next();
			Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}

	public static List<Student> readStudents(String file) throws FileNotFoundException {
		StudentReader reader = new StudentReader() {
			@Override
			public List<Angajat> citireAplicanti(String file) {
				return new ArrayList<>();
			}

			@Override
			public List<Aplicant> citireAplicant() {
				return new ArrayList<>();
			}
		};
		return reader.citireAplicant(file);
	}

	public static List<Angajat> readAngajati(String file) throws FileNotFoundException {
		AngajatReader reader = new AngajatReader() {
			@Override
			public List<Student> citireAplicant(String numeFisier) {
				return new ArrayList<>();
			}

			@Override
			public List<Aplicant> citireAplicant() {
				return new ArrayList<>();
			}
		};
		return reader.citireAplicanti(file);
	}

	public static void readAll() {
		List<Elev> listaelevi;
		List<Student> listastudenti;
		List<Angajat> listaangajati;

		try {
			listaelevi = Utils.readPupil("elevi.txt");
			for (int i = 0; i < listaelevi.size(); i++)
				System.out.println(listaelevi.get(i).toString());

			listastudenti = Utils.readStudents("studenti.txt");
			for (int i = 0; i < listastudenti.size(); i++)
				System.out.println(listastudenti.get(i).toString());

			listaangajati = Utils.readAngajati("angajati.txt");
			for (int i = 0; i < listaangajati.size(); i++)
				System.out.println(listaangajati.get(i).toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}