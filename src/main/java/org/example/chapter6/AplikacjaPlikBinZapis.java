package org.example.chapter6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AplikacjaPlikBinZapis {
    public static void main(String[] args) throws IOException {
        int[] liczby = {255, 0, 1, 2, 29, 10, 82, 92, 2, 17};
        BufferedOutputStream pisarz = null;
        try {
            pisarz = new BufferedOutputStream(new FileOutputStream("liczby.bin"), 512);
            for (int j : liczby) {
                pisarz.write(j);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (pisarz != null) pisarz.close();
        }

    }
}
