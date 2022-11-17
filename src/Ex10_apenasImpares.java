// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

import java.util.Scanner;

public class Ex10_apenasImpares {
    public static void main(String[] args) {

        int numero;


        for (int i = 1; i <=50; i++) {
            if (i % 2 != 0){

                System.out.println("Os números ímpares de 1 a 50 são: " + i);
            }
        }

    }
}
