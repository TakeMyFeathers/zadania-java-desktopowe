package org.example.chapter3;

import javax.swing.*;
import java.awt.*;

public class PanelBoxLayout extends JPanel {
    public PanelBoxLayout() {
        String[] napisy = {"Start", "Naprzód", "Zwiększ predkość odtwarzania", "Wstecz", "Stop"};

        float[] wyrownanie = {Component.LEFT_ALIGNMENT, Component.LEFT_ALIGNMENT, Component.CENTER_ALIGNMENT, Component.RIGHT_ALIGNMENT, Component.RIGHT_ALIGNMENT};
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        for (int k = 0; k < napisy.length; k++) {
            var przycisk = new JButton(napisy[k]);
            przycisk.setAlignmentX(wyrownanie[k]);
            add(przycisk);
        }
    }
}
