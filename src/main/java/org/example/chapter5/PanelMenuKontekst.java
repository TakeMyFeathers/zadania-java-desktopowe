package org.example.chapter5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class PanelMenuKontekst extends JPanel {
    private final String[] TEKST = {"Czerwony", "Niebieski", "Szary"};
    private final int[] KLAWISZ = {KeyEvent.VK_C, KeyEvent.VK_N, KeyEvent.VK_S};
    private final Color[] KOLOR = {Color.RED, Color.BLUE, Color.GRAY};

    public PanelMenuKontekst() {
        var menuKolory = new JPopupMenu();
        for (int i = 0; i < TEKST.length; i++) {
            var pozycja = new JMenuItem(TEKST[i]);
            pozycja.addActionListener(new KontekstZdarzenie(KOLOR[i], this));
            menuKolory.add(pozycja);
        }

        setComponentPopupMenu(menuKolory);
    }
}

class KontekstZdarzenie implements ActionListener {
    Color kolor;
    JPanel panel;

    public KontekstZdarzenie(Color kolor, JPanel panel) {
        this.kolor = kolor;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(kolor);
    }
}
