package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double b;
        System.out.print("Escribir numero: ");
        double a = Double.parseDouble(br.readLine());
        if ( a==0 ) {
            //Si
            System.out.println("Es 0");
        } else {
            //No
            b = a * -1;
            System.out.println("El resulrado es: ");
            System.out.println(b);
            System.out.println(a);


        }

    }
}
