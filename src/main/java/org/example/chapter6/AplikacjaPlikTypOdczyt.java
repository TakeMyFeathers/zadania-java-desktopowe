package org.example.chapter6;

import java.io.*;

public class AplikacjaPlikTypOdczyt {
    public static void main(String[] args) throws IOException {
        DataInputStream czytanie = null;
        try {
            czytanie = new DataInputStream(new BufferedInputStream(new FileInputStream("kurs.bin"), 512));
            while (true) {
                try {
                    String waluta = czytanie.readUTF();
                    int liczba = czytanie.readInt();
                    double kursSprzedaz = czytanie.readDouble();
                    double kursZakup = czytanie.readDouble();
                    System.out.format("%s %4d %6.2f %6.2f\n", waluta, liczba, kursSprzedaz, kursZakup);
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
