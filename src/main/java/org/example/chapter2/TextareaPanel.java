package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class TextareaPanel extends JPanel {
    public TextareaPanel() {
        super(new GridLayout(1, 1));

        var textarea = new JTextArea(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas lacinia commodo semper. Nunc vel \nsemper sem, eget placerat est. Fusce erat nulla, dictum elementum mattis vel,\n condimentum at purus. Ut semper arcu id ante convallis\n, sit amet pulvinar ex sollicitudin. Pellentesque\n sagittis dui eu tellus ultrices,\n ut posuere quam blandit."
        );
        textarea.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 16));
        add(new JScrollPane(textarea));
    }
}
