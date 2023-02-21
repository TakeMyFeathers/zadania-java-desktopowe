package org.example.chapter2;

import javax.swing.*;

public class SelectDialog {
    public static void main(String[] args) {
        String[] propozycje = {"C:(System)", "D:(Dane)", "E:(Zapas)"};
        String pytanie = "Na którym dysku zapisać pliki?";
        String tytul = "Zapisywanie dokumentu";

        String odp = (String) JOptionPane.showInputDialog(null, pytanie, tytul, JOptionPane.QUESTION_MESSAGE, null, propozycje, propozycje[1]);
        System.out.println("Odpowiedź: " + odp);
    }
}
