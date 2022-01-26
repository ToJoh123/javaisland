package com.company;

import java.util.*;
import java.io.*;

class AverageTemp {
    public  void getTemp() throws IOException {
        /*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Filnamn? ");
        String namn= input.readLine();
        var sc = new Scanner(new File(namn));
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());


         */
        InputStream in = AverageTemp.class.getResourceAsStream("../temp.txt");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



  /* // Alternativ med fildialogruta
    JFileChooser fc = new JFileChooser();
	int resultat = fc.showOpenDialog(null);
	if (resultat != JFileChooser.APPROVE_OPTION)
	  System.exit(0);
	var sc = new Scanner(fc.getSelectedFile());
 */
        /*
        int n = 0;            // antal temperatuer
        double sum = 0;       // summan av temperaturerna
        double highest = -273; // högsta temp hittills
        while (sc.hasNextDouble()) {   // finns det fler temperatuer?
            n++;
            double t = sc.nextDouble();     // ja, läs nästa temperatur
            sum += t;
            if (t > highest)
                highest = t;
        }
        System.out.println("Highest temp: " + highest +
                "\n average temp: " + sum/n);

         */
    }
}