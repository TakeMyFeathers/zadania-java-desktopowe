package org.example.chapter3;

import javax.swing.*;

public class PanelFlowLayout extends JPanel {
    public PanelFlowLayout() {
        String[] napisy = {"Start", "Naprzód", "Zwiększ predkość odtwarzania", "Wstecz", "Stop"};

        for (int k = 0; k < napisy.length; k++) {
            var przycisk = new JButton(napisy[k]);
            add(przycisk);
        }
    }
}
