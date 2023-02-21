package org.example.chapter4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ZdarzeniaKlawiatura extends JPanel {
    final int SREDNICA = 24;
    int koloX;
    int koloY;

    public ZdarzeniaKlawiatura() {
        setFocusable(true);
        addKeyListener(new ObslugaKlawiatura());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(koloX, koloY, SREDNICA, SREDNICA);
    }

    class ObslugaKlawiatura implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_DOWN -> koloY += 5;
                case KeyEvent.VK_UP -> koloY -= 5;
                case KeyEvent.VK_LEFT -> koloX -= 5;
                case KeyEvent.VK_RIGHT -> koloX += 5;
            }
            repaint();
        }
    }
}
