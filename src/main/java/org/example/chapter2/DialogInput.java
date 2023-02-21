package org.example.chapter2;

import javax.swing.*;

public class DialogInput {
    public static void main(String[] args) {
        String pytanie = "Czy zapisać zmiany na dysku?";
        String tytul = "Zapisywanie dokumentu";

        String odp = JOptionPane.showInputDialog(null, pytanie, tytul, JOptionPane.QUESTION_MESSAGE);
        System.out.println("nazwa pliku: " + odp);
    }
}
