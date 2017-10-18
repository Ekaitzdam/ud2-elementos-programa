package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        double a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introducir grados centigrados: ");
        a = Double.parseDouble(br.readLine());
        System.out.print("¿Mostrar en Fahrenheit o en Kelvin?: ");
        char b = br.readLine().charAt(0);
        if ( b == 'f' ){
            //Si
            a=a*255.9;
            System.out.print("El resultado es: ");
            System.out.println(a);
        }else if ( b == 'k'){
            //No
            a=a/255.9;
            System.out.print("El resultado es: ");
            System.out.println(a);
        }else if (b==b) {
            System.out.println("El caracter introducido es erroneo");
        }
    }
}
