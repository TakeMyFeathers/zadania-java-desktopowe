package org.example;

import org.example.chapter2.*;
import org.example.chapter3.*;
import org.example.chapter4.ZdarzeniaAkcja;
import org.example.chapter4.ZdarzeniaKlawiatura;
import org.example.chapter4.ZdarzeniaMysz;

import javax.swing.*;

public class Main {

    private static void createWindow(){
        var window = new JFrame("Aplikacja");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(new ZdarzeniaMysz());
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