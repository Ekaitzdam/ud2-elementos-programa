package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.print("Escribe algo: ");
        //teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Pantalla
        String mensaje = br.readLine();
        System.out.print("Tu mensaje es: ");
        System.out.println(mensaje);


    }
}
