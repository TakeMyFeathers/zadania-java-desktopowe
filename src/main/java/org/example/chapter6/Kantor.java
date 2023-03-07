package org.example.chapter6;

import java.io.Serializable;

public class Kantor implements Serializable {
    String waluta;
    int liczba;
    double kursSprzedaz;
    double kursZakup;

    public Kantor(String waluta, int liczba, double kursSprzedaz, double kursZakup) {
        this.waluta = waluta;
        this.liczba = liczba;
        this.kursSprzedaz = kursSprzedaz;
        this.kursZakup = kursZakup;
    }
}
