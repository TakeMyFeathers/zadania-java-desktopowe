package org.example.chapter5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class PasekMenu extends JMenuBar {
    public PasekMenu() {
        var mnPlik = new JMenu("Plik");
        mnPlik.setMnemonic(KeyEvent.VK_P);
        var mnEdycja = new JMenu("Edycja");
        mnEdycja.setMnemonic(KeyEvent.VK_E);

        var pzNowy = new JMenuItem("Nowy plik", KeyEvent.VK_N);
        var pzOtworz = new JMenuItem("Otwórz plik", KeyEvent.VK_O);
        var pzZapisz = new JMenuItem("Zapisz plik", KeyEvent.VK_Z);
        var pzKoniec = new JMenuItem("Koniec", KeyEvent.VK_K);

        pzNowy.addActionListener(new MenuZdarzenie(pzNowy.getText()));
        pzZapisz.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon.png")));

        mnPlik.add(pzNowy);
        mnPlik.add(pzOtworz);
        mnPlik.addSeparator();
        mnPlik.add(pzZapisz);
        mnPlik.addSeparator();
        mnPlik.add(pzKoniec);

        var pzKopiuj = new JMenuItem("Kopiuj", KeyEvent.VK_N);
        pzKopiuj.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        var pzWytnij = new JMenuItem("Wytnij", KeyEvent.VK_K);
        pzWytnij.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

        var pzWklej = new JMenuItem("Wklej", KeyEvent.VK_E);
        pzWklej.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));

        pzKopiuj.addActionListener(new MenuZdarzenie(pzKopiuj.getText()));
        var pzOrtografia = new JCheckBoxMenuItem("Korekta ortograficzna");
        var pzStyl = new JCheckBoxMenuItem("Korekta stylistyczna: ");
        pzStyl.addActionListener(new MenuZdarzenie(pzStyl.getText()));
        var pzDopisywanie = new JRadioButtonMenuItem("Tryb dopisywania");

        pzDopisywanie.addActionListener(new MenuZdarzenie(pzDopisywanie.getText()));
        var pzNadpisywanie = new JRadioButtonMenuItem("Tryb zastępowania");

        var grpMenu = new ButtonGroup();
        grpMenu.add(pzDopisywanie);
        grpMenu.add(pzNadpisywanie);

        mnEdycja.add(pzKopiuj);
        mnEdycja.add(pzWytnij);
        mnEdycja.add(pzWklej);
        mnEdycja.addSeparator();
        mnEdycja.add(pzOrtografia);
        mnEdycja.add(pzStyl);
        mnEdycja.addSeparator();
        mnEdycja.add(pzDopisywanie);
        mnEdycja.add(pzNadpisywanie);

        add(mnPlik);
        add(mnEdycja);
    }
}

class MenuZdarzenie implements ActionListener {
    String komunikat;

    public MenuZdarzenie(String komunikat) {
        this.komunikat = komunikat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, komunikat, "Zdarzenie", JOptionPane.INFORMATION_MESSAGE);
    }
}