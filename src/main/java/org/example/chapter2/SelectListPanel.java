package org.example.chapter2;

import javax.swing.*;

public class SelectListPanel extends JPanel {
    public SelectListPanel() {
        var kolory = new String[]{"Czerwony", "Niebieski", "Żółty"};
        var pory = new String[]{"Wiosna", "Lato", "Jesień", "Zima"};

        var kolor = new JComboBox<String>(kolory);
        kolor.addItem("Biały");
        kolor.addItem("Czarny");

        kolor.setEditable(true);
        kolor.setBounds(20, 20, 160, 30);

        var pora = new JComboBox<String>(pory);
        pora.setSelectedIndex(2);
        pora.setBounds(20, 70, 160, 30);
        add(kolor);
        add(pora);
        setLayout(null);
    }
}
