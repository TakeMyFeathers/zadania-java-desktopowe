package org.example.chapter2;

import javax.swing.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        String[] napisy = {
                "<html><i><font color='red'>S</font>tart</i></html>",
                "Stop",
                "Naprzód",
                "Wstecz"
        };
        for (var napis : napisy) add(new JButton(napis));
    }
}
