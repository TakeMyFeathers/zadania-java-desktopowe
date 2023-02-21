package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class WritingPanel extends JPanel {
    private String komunikat = "Witaj, to ja - twoja aplikacja";
    private Font czcionka = new Font("Times New Roman", Font.ITALIC + Font.BOLD, 36);
    private FontMetrics pomiar = getFontMetrics(czcionka);

    public WritingPanel() {
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(czcionka);
        int x = (getSize().width - pomiar.stringWidth(komunikat)) / 2;
        int y = getSize().height / 2;
        g.drawString(komunikat, x, y);
    }
}
