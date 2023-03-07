package org.example.chapter7;

public class Konto {
    double saldo;

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    public void wplata(double kwota) {
        int opoznieniePrzed = (int) (Math.random() * 120);
        int opoznieniePo = (int) (Math.random() * 30);

        try {
            Thread.sleep(opoznieniePrzed);
        } catch (InterruptedException ignored) {
        }

        double saldoPrzed = saldo;
        try {
            Thread.sleep(opoznieniePo);
        } catch (InterruptedException ignored) {
        }

        saldo = saldoPrzed + kwota;

        System.out.printf("%2s : %f : %f : %3d : %3d\n", Thread.currentThread().getName(), saldoPrzed, saldo, opoznieniePrzed, opoznieniePo);
    }
}
