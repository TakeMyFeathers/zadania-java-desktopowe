package org.example.chapter6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aplikacja2 {
    public static void main(String[] args) throws IOException {
        BufferedReader czytelnik = null;
        String wiersz;

        try {
            czytelnik = new BufferedReader(new FileReader("lorem.txt"));

            while ((wiersz = czytelnik.readLine()) != null) {
                System.out.println(wiersz);
            }
        } catch (IOException ex) {
            System.out.format("Błąd WE/WY: %s%n", ex);
        } finally {
            if (czytelnik != null) czytelnik.close();
        }
    }
}
