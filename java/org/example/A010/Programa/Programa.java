package org.example.A010.Programa;

import java.util.Scanner;

public class Programa {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Informe o seu ano de nascimento:");
        idade = sc.nextInt();
        nome = sc.nextLine();

        System.out.println("Informe o seu nome:");
        nome = sc.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + idade + ".");

    }
}
