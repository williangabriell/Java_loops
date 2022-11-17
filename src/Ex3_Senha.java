// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.


import java.util.Scanner;

public class Ex3_Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeUser;
        String senha;
        boolean validador = false;

        do {
            System.out.println("Digite seu Usuário: ");
            nomeUser = scan.next();
            System.out.println("Digite sua Senha: ");
            senha = scan.next();


            if (nomeUser.equalsIgnoreCase(senha)) {
                System.out.println("Você não pode usar essa senha, por favor escolha outra!");
            } else {
                validador = true;
                System.out.println("Bem-vindo, " + nomeUser);
            }
        } while(!validador);

    }
}
