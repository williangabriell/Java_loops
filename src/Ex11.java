// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeiro;
        int segundo;

        System.out.println("Digite o 1ª número: ");
        primeiro = scan.nextInt();
        System.out.println("Digite o 2ª número: ");
        segundo = scan.nextInt();

        if (primeiro < segundo) {
            for (int i = primeiro + 1; i < segundo; i++) {
                System.out.println(i + " ");
            }
        }else if (primeiro > segundo) {
                for(int i = primeiro-1; i >= segundo; i--){
                System.out.println(i + " ");
            }
            }





    }
}
