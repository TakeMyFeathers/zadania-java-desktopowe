package org.example.chapter6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aplikacja3 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner czytelnik = null;
        ArrayList<Kantor> kantor = new ArrayList<Kantor>();

        try {
            czytelnik = new Scanner(new BufferedReader(new FileReader("numeryki.txt")));
            var formatWe = new SimpleDateFormat("'Kiedy: 'yyyy-MM-dd HH:mm");
            Date date = formatWe.parse(czytelnik.nextLine());
            czytelnik.nextLine();

            while (czytelnik.hasNextLine()) {
                String waluta = czytelnik.next();
                int liczba = czytelnik.nextInt();
                double sprzedaz = czytelnik.nextDouble();
                double skup = czytelnik.nextDouble();
                czytelnik.nextLine();
                kantor.add(new Kantor(waluta, liczba, sprzedaz, skup));
            }

            var formatWy = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            System.out.printf("Data notowania: %s%s", formatWy.format(date));

            System.out.format("%s %4s %10s %10s%n", "Waluta", "Ile", "Sprzedaż", "Skup");

            for (var k : kantor) {
                System.out.format("%-6S %4d %10.4f %8.4f%n", k.waluta, k.liczba, k.kursSprzedaz, k.kursZakup);
            }
        }catch (IOException e){
            System.err.format("Błąd WE/WY: %s%n", e);
        }finally {
            if (czytelnik != null) czytelnik.close();
        }
    }
}
