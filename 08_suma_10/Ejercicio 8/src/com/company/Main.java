package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double z = 0;
        double b = 1;
        for (z = 0; b <= 10; b++) {


            System.out.print("Introducir numero: ");
            double a = Double.parseDouble(br.readLine());

            z = z + a;
        }


        System.out.println("El resultado es: ");
        System.out.println(z);

    }
}
