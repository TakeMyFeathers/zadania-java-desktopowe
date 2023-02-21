package org.example.chapter4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ZdarzeniaMysz extends JPanel {
    final int SREDNICA = 24;
    int koloX;
    int koloY;

    public ZdarzeniaMysz() {
        addMouseListener(new ObslugaMysz());

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(koloX, koloY, SREDNICA, SREDNICA);
    }

    class ObslugaMysz implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            koloX = e.getX() - SREDNICA / 2;
            koloX = e.getY() - SREDNICA / 2;
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
