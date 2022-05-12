package br.com.dio.excercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("digite o numero: ");
            numero= scan.nextInt();
            count = count + 1;
            soma = soma + numero;

        if (numero > maior) maior = numero;

        } while (count < 5);
        System.out.println("maior numero :" + maior);
        System.out.println("Media: " +  soma/5);
    }
}
