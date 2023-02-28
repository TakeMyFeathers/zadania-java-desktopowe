package org.example.chapter5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Aplikacja {
    private static void createWindow(){
        var window = new JFrame("Aplikacja");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLayout(new BorderLayout());
        window.add(new PanelPasekStanu(), BorderLayout.PAGE_END );

        window.setBounds(100, 50, 400, 200);

        window.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });
    }
}
