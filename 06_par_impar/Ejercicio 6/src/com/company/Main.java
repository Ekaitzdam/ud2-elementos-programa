package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double z;
        System.out.print("Introducir numero: ");
        double a = Double.parseDouble(br.readLine());
        z = a%2;
        if ( z==0 ) {
            //true
            System.out.println("Es par");
        } else {
            //False
            System.out.println("Es impar");
        }


    }
}
