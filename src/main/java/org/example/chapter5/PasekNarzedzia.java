package org.example.chapter5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasekNarzedzia extends JToolBar {
    private final String[] IKONA = {"play.png", "pause.png", "icon.png"};
    private final String[] TEKST = {"Start", "Stop", "Pauza"};

    public PasekNarzedzia() {
        super("Multimedia");
        for (int i = 0; i < IKONA.length; i++) {
            var przycisk = new JButton(new ImageIcon(ClassLoader.getSystemResource(IKONA[i])));
            przycisk.addActionListener(new PasekZdarzenia(TEKST[i]));
            przycisk.setToolTipText(TEKST[i]);
            add(przycisk);
        }
        addSeparator();
        var nazwa = new JLabel("Wykonawca: Myszka Miki");
        add(nazwa);
    }
}

class PasekZdarzenia implements ActionListener{
    String komunikat;

    public PasekZdarzenia(String komunikat) {
        this.komunikat = komunikat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, komunikat, "Zdarzenie", JOptionPane.INFORMATION_MESSAGE);
    }
}