package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class TabPanel extends JTabbedPane {
    public TabPanel() {
        var icon = new ImageIcon(ClassLoader.getSystemResource("icon.png"));

        var redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        var yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        addTab("Czerwona", icon, redPanel, "Zakładka czerwona");
        addTab("Żółta", icon, yellowPanel, "Zakładka żółta");
    }
}
