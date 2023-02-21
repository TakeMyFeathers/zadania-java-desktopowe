package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class LabelPanel extends JPanel {
    public LabelPanel() {
        var windLabel = new JLabel("Siła wiatru: ", JLabel.LEFT);
        windLabel.setBounds(0, 20, 160, 30);
        windLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));

        var tempLabel = new JLabel("<html><font color=#FFFFFF>Temperatura: </font></html>", new ImageIcon(ClassLoader.getSystemResource("icon.png")), JLabel.TRAILING);
        tempLabel.setVerticalTextPosition(JLabel.CENTER);
        tempLabel.setHorizontalTextPosition(JLabel.RIGHT);
        tempLabel.setBounds(0, 60, 160, 30);
        tempLabel.setBackground(Color.GRAY);
        tempLabel.setOpaque(true);

        add(windLabel);
        add(tempLabel);

        setLayout(null);
    }
}
