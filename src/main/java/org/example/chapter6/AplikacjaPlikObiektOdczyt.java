package org.example.chapter6;

import java.io.*;

public class AplikacjaPlikObiektOdczyt {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream czytanie = null;
        Kantor kantor;
        try {
            czytanie = new ObjectInputStream(new BufferedInputStream(new FileInputStream("kurs.bin"), 512));
            while (true) {
                try {
                    kantor = (Kantor)czytanie.readObject();
                    System.out.format("%s %4d %6.2f %6.2f\n", kantor.waluta, kantor.liczba, kantor.kursSprzedaz, kantor.kursZakup);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (czytanie != null) czytanie.close();
        }
    }
}
