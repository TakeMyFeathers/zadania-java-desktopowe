package org.example.chapter2;

import javax.swing.*;

public class ListPanel extends JPanel {
    public ListPanel() {
        var pory = new String[]{"Wiosna", "Lato", "Jesień", "Zima"};
        var kolory = new String[]{"Czarny", "Biały", "Różowy", "Czerwony", "Pomarańczowy", "Brązowy", "Żółty", "Szary", "Zielony", "Błękitny", "Fioletowy"};

        var pora = new JList<String>(pory);
        pora.setSelectedIndex(2);
        pora.setBounds(10, 10, 80, 80);

        var koloryDane = new DefaultListModel<String>();
        for (var nazwa : kolory) koloryDane.addElement(nazwa);
        var kolor = new JList<String>(koloryDane);
        kolor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        kolor.setLayoutOrientation(JList.VERTICAL_WRAP);
        kolor.setVisibleRowCount(-1);
        var panelKolor = new JScrollPane(kolor);

        panelKolor.setBounds(100, 10, 240, 80);
        add(pora);
        add(panelKolor);
        setLayout(null);
    }
}
