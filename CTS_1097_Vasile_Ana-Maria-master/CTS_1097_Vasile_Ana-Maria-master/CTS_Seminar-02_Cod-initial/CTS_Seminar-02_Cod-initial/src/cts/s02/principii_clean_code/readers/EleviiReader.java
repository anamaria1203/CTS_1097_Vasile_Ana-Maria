package cts.s02.principii_clean_code.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviiReader extends AplicantReader {

    @Override
    public List<Student> citireAplicant(String numeFisier) {
        return new ArrayList<>();
    }

    @Override
    public List<Aplicant> citireAplicant() {
        return new ArrayList<>();
    }

    @Override
    public List<Angajat> citireAplicanti(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            scanner.useDelimiter(",|\n");
            List<Elev> elevi = new ArrayList<>();

            while (scanner.hasNext()) {
                Elev elev = new Elev();
                super.citireAplicant(scanner, elev);  // citește câmpurile de bază
                int clasa = scanner.nextInt();
                String tutore = scanner.next();
                elev.setClasa(clasa);
                elev.setTutore(tutore);
                elevi.add(elev);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}