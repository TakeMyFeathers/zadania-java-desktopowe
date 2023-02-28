package org.example.chapter5;

import javax.swing.*;
import java.awt.*;

public class PanelPasekStanu extends JPanel {
    public PanelPasekStanu() {
        setBorder(BorderFactory.createLoweredBevelBorder());
        setLayout(new GridLayout(1, 2));

        var pozycja = new JLabel("Pozycja: 2/65");
        var kodek = new JLabel("Kodek: MP3", SwingConstants.RIGHT);
        add(pozycja);
        add(kodek);
    }
}
