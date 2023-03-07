package org.example.chapter7;

public class KasjerWplata implements Runnable {
    Konto konto;
    double kwota;

    public KasjerWplata(Konto konto, double kwota) {
        this.konto = konto;
        this.kwota = kwota;
    }

    @Override
    public void run() {
        konto.wplata(kwota);
    }
}
