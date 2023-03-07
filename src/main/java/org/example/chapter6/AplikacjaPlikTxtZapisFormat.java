package org.example.chapter6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class AplikacjaPlikTxtZapisFormat {
    public static void main(String[] args) {
        String[] waluta = {"usd", "eur", "chf", "jpy"};
        int[] liczba = {1, 1, 1, 100};
        double[] sprzedaz = {2.1312, 4.1231, 4.1234, 2.5345};
        double[] skup = {2.1451, 4.4331, 4.1544, 2.5565};

        PrintWriter pisarz = null;

        try {
            pisarz = new PrintWriter(new FileWriter("numeryki.txt"));
            pisarz.printf("Kiedy: %1$tY %1$tB %1$td %1$tH:%1$tM %n", Calendar.getInstance());
            pisarz.format("%s %4s %10s %10s%n", "Waluta", "Ile", "Sprzedaż", "Skup");

            for (int k = 0; k < waluta.length; k++) {
                pisarz.format("%-6S %4d %10.4f %08.4f%n", waluta[k], liczba[k], sprzedaz[k], skup[k]);
            }
        } catch (IOException e) {
            System.err.format("Błąd WE/WY: %s%n", e);
        }finally {
            if (pisarz != null) pisarz.close();
        }
    }
}
