package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class RadioInputPanel extends JPanel {
    public RadioInputPanel() {
        var kolory = new String[]{"Czerwony", "Niebieski", "Żółty"};
        var pory = new String[]{"Wiosna", "Lato", "Jesień", "Zima"};

        var opcjeKolor = new JRadioButton[kolory.length];
        for (int k = 0; k < kolory.length; k++) {
            opcjeKolor[k] = new JRadioButton(kolory[k]);
        }

        var opcjePora = new JRadioButton[pory.length];
        for (int k = 0; k < pory.length; k++) {
            opcjePora[k] = new JRadioButton(pory[k]);
        }

        var kolorGrupy = new ButtonGroup();
        for (var opcja : opcjeKolor) kolorGrupy.add(opcja);

        var poraGrupy = new ButtonGroup();
        for (var opcja : opcjePora) poraGrupy.add(opcja);

        var panelKolory = new JPanel(new GridLayout(3, 1));
        panelKolory.setBounds(10, 10, 110, 80);
        panelKolory.setBorder(BorderFactory.createRaisedBevelBorder());
        for (var opcja : opcjeKolor) panelKolory.add(opcja);

        var panelPora = new JPanel(new GridLayout(4, 1));
        panelPora.setBounds(150,10, 110, 100);
        panelPora.setBorder(BorderFactory.createRaisedBevelBorder());
        for (var opcja : opcjePora) panelPora.add(opcja);

        opcjeKolor[1].setSelected(true);
        opcjePora[2].setSelected(true);

        add(panelKolory);
        add(panelPora);

        setLayout(null);
    }
}
