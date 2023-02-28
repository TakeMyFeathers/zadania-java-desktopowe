package org.example.chapter5;

import org.example.chapter2.RadioInputPanel;

import javax.swing.*;

public class AplikacjaPasekMenu {
    private static void createWindow(){
        var window = new JFrame("Aplikacja");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setJMenuBar(new PasekMenu());
        window.setSize(400, 200);
        window.setLocation(100, 50);
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
