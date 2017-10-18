package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double c, b, a;
        c = 0;
        b = 0;
        System.out.print("Cuantos valores quieres sumar?: ");
        a = Double.parseDouble(br.readLine());
        while (a != 0) {
            System.out.print("Introducir numero: ");
            b = Double.parseDouble(br.readLine());
            c = c + b;
            a = a - 1;
        }
        System.out.println("El resultado es: ");
        System.out.println(c);
    }

}