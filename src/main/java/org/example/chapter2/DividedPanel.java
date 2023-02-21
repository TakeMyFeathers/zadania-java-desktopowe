package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class DividedPanel extends JSplitPane {
    public DividedPanel() {
        var redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        var yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        setLeftComponent(redPanel);
        setRightComponent(yellowPanel);

        setDividerLocation(100);
        setOneTouchExpandable(true);

    }
}
