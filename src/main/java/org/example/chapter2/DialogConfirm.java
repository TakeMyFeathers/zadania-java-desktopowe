package org.example.chapter2;

import javax.swing.*;

public class DialogConfirm {
    public static void main(String[] args) {
        String[] propozycje = {"Tak, zapisz", "Raczej nie", "Anuluj"};
        String pytanie = "Czy zapisać zmiany na dysku?";
        String tytul = "Zapisywanie dokumentu";
        String komunikat = "";

        int odp = JOptionPane.showOptionDialog(null, pytanie, tytul, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, propozycje, propozycje[1]);
        switch (odp) {
            case JOptionPane.YES_OPTION:
                komunikat = "TAK";
                break;
            case JOptionPane.NO_OPTION:
                komunikat = "NIE";
                break;
            case JOptionPane.CANCEL_OPTION:
                komunikat = "ANULUJ";
                break;
            default:
                komunikat = "???";
                break;
        }
        System.out.println("Odpowiedź: " + komunikat);
    }
}
