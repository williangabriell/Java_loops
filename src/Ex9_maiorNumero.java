// Faça um programa que leia 5 números e informe o maior número.


import java.util.Scanner;

public class Ex9_maiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int count = 0;

        while (count < 5) {

            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            count++;

        }
        System.out.println("O maior número é: " + maior);

        }
    }

