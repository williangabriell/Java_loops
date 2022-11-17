// Faça um programa que leia 5 números e informe a soma e a média dos números.


import java.util.Scanner;

public class ex4_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count ++;
        } while(count < 5);
        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (soma/5));




    }
}
