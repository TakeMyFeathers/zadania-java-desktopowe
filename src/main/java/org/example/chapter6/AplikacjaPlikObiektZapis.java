package org.example.chapter6;

import java.io.*;

public class AplikacjaPlikObiektZapis {
    public static void main(String[] args) throws IOException {
        String[] waluta = {"usd", "eur", "chf", "jpy"};
        int[] liczba = {1, 1, 1, 1, 100};
        double[] kursSprzedaz = {2.8465, 4.0924, 2.7510, 3.0639};
        double[] kursZakup = {2.8565, 4.1124, 2.9810, 3.0841};

        ObjectOutputStream pisarz = null;
        try {
            pisarz = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("kantor.bin"), 512));
            for (int i = 0; i < waluta.length; i++) {
                var kantor = new Kantor(waluta[i], liczba[i], kursSprzedaz[i], kursZakup[i]);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (pisarz != null) pisarz.close();
        }
    }
}
