package cts.s02.principii_clean_code.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class StudentReader extends AplicantReader {

    @Override
    public List<Student> citireAplicant(String numeFisier) {
        try {
            Scanner scanner = new Scanner(new File(numeFisier));
            scanner.useDelimiter(",|\n");
            List<Student> studenti = new ArrayList<>();

            while (scanner.hasNext()) {
                Student student = new Student();
                super.citireAplicant(scanner, student);
                int anStudii = scanner.nextInt();
                String facultate = scanner.next();
                student.setAn_studii(anStudii);
                student.setFacultate(facultate);
                studenti.add(student);
            }

            scanner.close();
            return studenti;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}