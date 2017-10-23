package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto;
        int n;
        n = 0;
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        do {
            System.out.print("Escriba un numero entre el 0 y el 100: ");
            texto = br.readLine();
                //si
            if (!texto.equalsIgnoreCase("FIN")) {


                //no ha escrito fin
                n = Integer.parseInt(texto);

                if (n == aleatorio) {
                    //si
                    System.out.println("Has acertado");

                } else if (n < aleatorio) {
                    //si
                    System.out.println("Es mayor");
                    System.out.println("Intentalo de nuevo");
                } else {
                    //no
                    System.out.println("Es menor");
                    System.out.println("Intentalo de nuevo");
                }

            }

            }while (!texto.equalsIgnoreCase("FIN") && n != aleatorio);
        System.out.println("Fin del juego");

        }


    }

