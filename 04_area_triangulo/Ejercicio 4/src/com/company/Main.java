package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double c;
        System.out.print("Introducir valor de la base: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Introducir valor de la altura: ");
        double b = Double.parseDouble(br.readLine());
        c = a/2 * b;
        System.out.print("El resultado del área es: ");
        System.out.println( c );


    }
}
