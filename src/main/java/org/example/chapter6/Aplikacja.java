package org.example.chapter6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Aplikacja {
    public static void main(String[] args) throws IOException {
        String tekst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                " Nullam et leo venenatis, tempus massa nec, tincidunt ex. Vestibulum\n" +
                " iaculis, arcu varius vestibulum pellentesque, diam nulla iaculis tortor,n" +
                "et tincidunt urna tortor a ante. Morbi pulvinar sit amet sem quis consectetur\n" +
                " Quisque et maximus turpis, ac molestie nibh.\n";
        BufferedWriter pisarz = null;
        try {
            pisarz = new BufferedWriter(new FileWriter("lorem.txt"));
            pisarz.write(tekst);
        } catch (IOException ex) {
            System.err.format("Błąd WE/WY: %s%n", ex);
        } finally {
            if (pisarz != null) pisarz.close();
        }
    }
}
