package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double precio, cantidad, cambio, monedas;
        double resto;
        cantidad = 0;
        precio = 0;
        System.out.print("Escribe el valor del producto: ");
        precio = Double.parseDouble(br.readLine());

        do {
            System.out.print("Escriba valor introducido: ");
            cantidad = Double.parseDouble(br.readLine());
            resto = cantidad % 5;
        }while (cantidad >= precio && resto == 0);

        if (cantidad==precio) {
            //Si
            System.out.println("Importe exacto");
        } else {
            //No
            cambio = (cantidad * precio)*100;

            monedas = cambio / 200;
            System.out.println("Monedas de 2€");
            cambio= cambio % 200;

            monedas = cambio / 100;
            System.out.println("Monedas de 1€");
            cambio= cambio % 100;

            monedas = cambio / 50;
            System.out.println("Monedas de 50c");
            cambio= cambio % 50;

            monedas = cambio / 20;
            System.out.println("Monedas de 20c");
            cambio= cambio % 20;

            monedas = cambio / 10;
            System.out.println("Monedas de 10c");
            cambio= cambio % 10;

            monedas = cambio / 5;
            System.out.println("Monedas de 5c");


        }
    }
}
