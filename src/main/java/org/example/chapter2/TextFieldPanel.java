package org.example.chapter2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

public class TextFieldPanel extends JPanel {
    public TextFieldPanel() {
        var balanceLabel = new JLabel("Stan konta: ");
        var passwordLabel = new JLabel("Hasło: ");

        var balanceInput = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        var passwordInput = new JPasswordField();

        balanceLabel.setDisplayedMnemonic(KeyEvent.VK_S);
        balanceLabel.setLabelFor(balanceInput);
        balanceLabel.setBounds(10, 20, 120, 24);

        passwordLabel.setDisplayedMnemonic(KeyEvent.VK_H);
        passwordLabel.setLabelFor(passwordInput);
        passwordLabel.setBounds(10, 50, 120, 24);

        balanceInput.setBounds(120, 20, 160, 24);
        passwordInput.setBounds(120, 50, 160, 24);

        add(balanceLabel);
        add(balanceInput);
        add(passwordLabel);
        add(passwordInput);

        setLayout(null);
    }
}
