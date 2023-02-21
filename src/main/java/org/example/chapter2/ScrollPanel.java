package org.example.chapter2;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollPanel extends JPanel implements AdjustmentListener {

    private JScrollBar pasek;
    private JLabel komunikat;

    public ScrollPanel() {
        komunikat = new JLabel();
        komunikat.setBounds(5, 5, 40, 20);

        pasek = new JScrollBar(JScrollBar.HORIZONTAL, 1, 10, 1, 100);
        pasek.setBlockIncrement(10);
        pasek.setBounds(5, 30, 280, 20);
        pasek.addAdjustmentListener(this);
        add(pasek);
        add(komunikat);
        setLayout(null);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        komunikat.setText(Integer.toString(e.getValue()));
    }
}
