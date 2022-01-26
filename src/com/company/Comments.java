package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comments {
    public  void getComments() throws IOException {
        JFileChooser fc = new JFileChooser();
        int resultat = fc.showOpenDialog(null);
        if (resultat != JFileChooser.APPROVE_OPTION)
            System.exit(0);  // ingen fil valdes
        String filnamn = fc.getSelectedFile().getAbsolutePath();
        BufferedReader inStream = new BufferedReader
                (new FileReader(filnamn));
        int n = 0,    // totala antalet rader i filen
                k = 0;    // antalet rader med kommentarer
        while (true) {
            String rad = inStream.readLine();
            if (rad == null)  // är filen slut?
                break;   // ja!
            n++;   // nej
            if (rad.contains("//"))
                k++;   // kommentar finns p� raden
        }
        JOptionPane.showMessageDialog
                (null, 100.0*k/n + " % of the rows contains comments");
    }
}
