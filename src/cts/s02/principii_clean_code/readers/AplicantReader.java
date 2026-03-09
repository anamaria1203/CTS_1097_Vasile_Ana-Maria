package cts.s02.principii_clean_code.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

    public void citireAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int numarProiecte = input.nextInt();
        String[] denumiriProiecte = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++)
            denumiriProiecte[i] = input.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setPunctaj(punctaj);
        aplicant.setVarsta(varsta);
        aplicant.setNumarProiecte(numarProiecte, denumiriProiecte);
    }

    public abstract List<Student> citireAplicant(String numeFisier);
    public abstract List<Aplicant> citireAplicant();
    public abstract List<Angajat> citireAplicanti(String file);
}