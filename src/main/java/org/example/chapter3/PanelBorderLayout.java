package org.example.chapter3;

import javax.swing.*;
import java.awt.*;

public class PanelBorderLayout extends JPanel {
    public PanelBorderLayout() {

        String[] napisy = {"Start", "Naprzód", "Zwiększ predkość odtwarzania", "Wstecz", "Stop"};

        String[] polozenie = {BorderLayout.PAGE_START, BorderLayout.LINE_START, BorderLayout.CENTER, BorderLayout.LINE_END, BorderLayout.PAGE_END};

        setLayout(new BorderLayout(10, 20));

        for (int k = 0; k < napisy.length; k++) {
            var przycisk = new JButton(napisy[k]);
            add(przycisk, polozenie[k]);
        }
    }
}
