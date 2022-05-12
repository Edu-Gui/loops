package br.com.dio.excercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("tabuada de: " + tabuada);

        for (int i = 1;i <=10;i++){
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));

        }

    }
}
