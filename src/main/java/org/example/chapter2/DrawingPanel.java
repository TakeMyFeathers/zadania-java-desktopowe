package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    private final int SRED = 24;

    public DrawingPanel() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < (getSize().width - SRED); x += SRED)
            for (int y = 0; y < (getSize().height - SRED); y += SRED) {
                int cz = (int) Math.floor(Math.random() * 256);
                int zn = (int) Math.floor(Math.random() * 256);
                int nb = (int) Math.floor(Math.random() * 256);

                g.setColor(new Color(cz, zn, nb));
                g.fillOval(x, y, SRED, SRED);
            }
    }
}

