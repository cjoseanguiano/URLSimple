package com.devix.company;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            URL mySite = new URL("http://www.cs.utexas.edu/~scottm");
            URLConnection urlConnection = mySite.openConnection();
            Scanner scanner = new Scanner(new InputStreamReader(urlConnection.getInputStream()));
            int cont = 0;
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
                cont++;
            }
            System.out.println("Numero de tokens: ");
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
