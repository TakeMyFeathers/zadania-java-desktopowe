package org.example.chapter7;

public class Bank {
    public static void main(String[] args) {
        Konto konto = new Konto(100.0);

        for (int k = 1; k <= 10; k++) {
            Thread watek = new Thread(new KasjerWplata(konto, 1), Integer.toString(k));
            watek.start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Saldo: " + konto.saldo);
    }
}
