package org.example.chapter3;

import javax.swing.*;
import java.awt.*;

public class PanelGridLayout extends JPanel {
    public PanelGridLayout() {
        String[] napisy = {"Start", "Naprzód", "Zwiększ predkość odtwarzania", "Wstecz", "Stop"};

        setLayout(new GridLayout(3, 2, 20, 10));

        for (int k = 0; k < napisy.length; k++) {
            var przycisk = new JButton(napisy[k]);
            add(przycisk);
        }
    }
}
