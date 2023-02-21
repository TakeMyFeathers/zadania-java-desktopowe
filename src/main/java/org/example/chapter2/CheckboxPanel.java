package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class CheckboxPanel extends JPanel {
    public CheckboxPanel() {
        var kolory = new String[]{"Czerwony", "Niebieski", "Żółty"};
        var pory = new String[]{"Wiosna", "Lato", "Jesień", "Zima"};

        var opcjeKolor = new JCheckBox[kolory.length];
        for (int k = 0; k < kolory.length; k++) {
            opcjeKolor[k] = new JCheckBox(kolory[k]);
        }

        var opcjePora = new JCheckBox[pory.length];
        for (int k = 0; k < pory.length; k++) {
            opcjePora[k] = new JCheckBox(pory[k]);
        }

        var panelKolory = new JPanel(new GridLayout(3, 1));
        panelKolory.setBounds(10, 10, 110, 80);
        panelKolory.setBorder(BorderFactory.createRaisedBevelBorder());
        for (var opcja : opcjeKolor) panelKolory.add(opcja);

        var panelPora = new JPanel(new GridLayout(4, 1));
        panelPora.setBounds(150,10, 110, 100);
        panelPora.setBorder(BorderFactory.createRaisedBevelBorder());
        for (var opcja : opcjePora) panelPora.add(opcja);

        opcjeKolor[1].setSelected(true);
        opcjeKolor[2].setSelected(true);

        opcjePora[2].setSelected(true);
        opcjePora[3].setSelected(true);

        add(panelKolory);
        add(panelPora);

        setLayout(null);

    }
}
