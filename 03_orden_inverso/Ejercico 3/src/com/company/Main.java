package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Escribe el primer número: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Escribe el segundo número: ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("Escribe el tercer numero: ");
        double c = Double.parseDouble(br.readLine());
        System.out.println("El resultado en modo inverso es: ");
        System.out.println( c );
        System.out.println( b );
        System.out.println( a );

    }
}
