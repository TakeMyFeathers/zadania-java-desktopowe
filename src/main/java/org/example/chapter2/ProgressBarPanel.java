package org.example.chapter2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarPanel extends JPanel implements ActionListener {
    private Timer timer = new Timer(200, this);
    private JProgressBar postep;

    public ProgressBarPanel() {
        postep = new JProgressBar(JProgressBar.HORIZONTAL, 1, 20);
        postep.setStringPainted(true);
        postep.setBounds(5, 5, 280, 20);
        add(postep);
        setLayout(null);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int wartosc = postep.getValue();
        if (wartosc < postep.getMaximum()) {
            postep.setValue(++wartosc);
        } else {
            timer.stop();
        }
    }
}
