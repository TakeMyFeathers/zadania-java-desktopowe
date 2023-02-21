package org.example.chapter2;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PanelWithInput extends JPanel {
    public PanelWithInput() {
        var surnameLabel = new JLabel("Nazwisko: ");
        var surnameInput = new JTextField();

        surnameLabel.setDisplayedMnemonic(KeyEvent.VK_N);
        surnameLabel.setLabelFor(surnameInput);
        surnameLabel.setBounds(10, 20, 120, 24);
        surnameInput.setBounds(120, 20, 160, 24);

        add(surnameLabel);
        add(surnameInput);

        setLayout(null);

    }
}
