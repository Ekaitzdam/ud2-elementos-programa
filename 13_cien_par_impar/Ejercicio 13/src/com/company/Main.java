package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        String a;
        System.out.print("Elige Par o Impar: ");
        a = br.readLine();

        if (a.equalsIgnoreCase("PAR")) {
            //Si
            b = 0;
            for ( int d = 0;  d < 50; d++) {
                b = b + 2;
                System.out.println(b);
            }
        } else if (a.equalsIgnoreCase("IMPAR")) {
            //SI
            b = 1;
            for ( int d = 0;  d < 50; d++) {
                b = b + 2;
                System.out.println(b);
            }
        } else {
            //no
            System.out.println("Error");
        }



        
    }
}
