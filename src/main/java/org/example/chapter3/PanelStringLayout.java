package org.example.chapter3;

import javax.swing.*;

public class PanelStringLayout extends JPanel {
    public PanelStringLayout() {
        String[] napisy = {"Start", "Naprzód", "Zwiększ predkość odtwarzania", "Wstecz", "Stop"};
        var uklad = new SpringLayout();

        setLayout(uklad);

        var btnStart = (JButton) add(new JButton(napisy[0]));
        var btnNaprzod = (JButton) add(new JButton(napisy[1]));
        var btnZwieksz = (JButton) add(new JButton(napisy[2]));
        var btnWstecz = (JButton) add(new JButton(napisy[3]));
        var btnStop = (JButton) add(new JButton(napisy[4]));

        uklad.putConstraint(SpringLayout.WEST, btnStart, 5, SpringLayout.WEST, this);
        uklad.putConstraint(SpringLayout.NORTH, btnStart, 5, SpringLayout.NORTH, this);

        uklad.putConstraint(SpringLayout.EAST, btnNaprzod, -5, SpringLayout.EAST, this);
        uklad.putConstraint(SpringLayout.NORTH, btnNaprzod, 0, SpringLayout.WEST, btnStart);

        uklad.putConstraint(SpringLayout.WEST, btnZwieksz, 0, SpringLayout.WEST, btnStart);
        uklad.putConstraint(SpringLayout.EAST, btnZwieksz, 0, SpringLayout.EAST, btnStop);
        uklad.putConstraint(SpringLayout.NORTH, btnZwieksz, 10, SpringLayout.SOUTH, btnStart);

        uklad.putConstraint(SpringLayout.WEST, btnWstecz, 0, SpringLayout.WEST, btnStart);
        uklad.putConstraint(SpringLayout.SOUTH, btnWstecz, -5, SpringLayout.SOUTH, this);

        uklad.putConstraint(SpringLayout.EAST, btnStop, 0, SpringLayout.EAST, btnNaprzod);
        uklad.putConstraint(SpringLayout.SOUTH, btnStop, 5, SpringLayout.SOUTH, this);
    }
}
