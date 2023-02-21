package org.example.chapter4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZdarzeniaAkcja extends JPanel implements ActionListener {
    public ZdarzeniaAkcja() {
        var redButton = new JButton("Czerwony");
        redButton.addActionListener(this);
        add(redButton);

        var blueButton = new JButton("Niebieski");
        blueButton.addActionListener(this);
        add(blueButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Czerwony" -> setBackground(Color.RED);
            case "Niebieski" -> setBackground(Color.BLUE);
        }
    }

    class ObslugaZdarzenia implements ActionListener{
        JPanel panel;
        Color kolor;

        public ObslugaZdarzenia(JPanel panel, Color kolor) {
            this.panel = panel;
            this.kolor = kolor;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(kolor);
        }
    }
}
