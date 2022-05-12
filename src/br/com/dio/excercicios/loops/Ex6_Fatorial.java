package br.com.dio.excercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("fatorial:");
        int fatorial = scan.nextInt();
        int multiplicação = 1;

        System.out.print(fatorial + "! =" );

        for (int i = fatorial ;i >= 1 ; i = i -1 ){
            multiplicação = multiplicação * i;
        }
        System.out.println(multiplicação);
    }
}
