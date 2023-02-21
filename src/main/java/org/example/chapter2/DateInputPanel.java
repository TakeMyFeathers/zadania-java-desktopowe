package org.example.chapter2;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateInputPanel extends JPanel {
    public DateInputPanel() {
        var dateLabel = new JLabel("Data urodzenia: ");
        var dateInput = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));

        dateLabel.setLabelFor(dateInput);
        dateLabel.setDisplayedMnemonic(KeyEvent.VK_D);
        dateLabel.setBounds(10, 20, 120, 24);

        try {
            var dateMask = new MaskFormatter("####-##-##");
            dateMask.setPlaceholder("_");
            dateMask.install(dateInput);
        } catch (ParseException ex) {
        }

        dateInput.setBounds(120, 20, 160, 24);
        add(dateLabel);
        add(dateInput);

        setLayout(null);

    }
}
