

package cts.s02.principii_clean_code.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AngajatReader extends AplicantReader {

    @Override
    public List<Angajat> citireAplicanti(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            scanner.useDelimiter(",\\s*|\\r?\\n");
            List<Angajat> angajati = new ArrayList<>();

            while (scanner.hasNext()) {
                if (!scanner.hasNext(".*\\S.*")) {
                    scanner.next();
                    continue;
                }
                Angajat angajat = new Angajat();
                super.citireAplicant(scanner, angajat);
                int salariu = scanner.nextInt();
                String ocupatie = scanner.next();
                angajat.setSalariu(salariu);
                angajat.setOcupatie(ocupatie);
                angajati.add(angajat);
            }

            scanner.close();
            return angajati;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}



