package br.com.dio.excercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares =0;
        int quantImpares = 0;

        System.out.println("quantidade de numeros: ");
        quantNumeros = scan.nextInt();
        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while (count < quantNumeros);
        System.out.println("quantidade par: " + quantPares);
        System.out.println("quantidade impar: " + quantImpares);

    }
}
