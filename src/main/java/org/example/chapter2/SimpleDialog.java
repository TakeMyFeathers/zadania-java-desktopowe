package org.example.chapter2;

import javax.swing.*;

public class SimpleDialog {
    public static void main(String[] args) {
        String pytanie = "Czy zapisać zmiany na dysku?";
        String tytul = "Zapisywanie dokumentu";
        String komunikat = "";

        int odp = JOptionPane.showConfirmDialog(null, pytanie, tytul, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (odp) {
            case JOptionPane.YES_OPTION:
                komunikat = "TAK";
                break;
            case JOptionPane.NO_OPTION:
                komunikat = "NIE";
                break;
            default:
                komunikat = "???";
                break;
        }
        System.out.println("Odpowiedź: " + komunikat);
    }
}
