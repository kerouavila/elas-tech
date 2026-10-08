package org.example.A008.Strings;

import java.util.Scanner;

public class Strings {
    static void main() {

        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        Scanner sc = new Scanner(System.in);

        String nome;
        String nome2;
        String palavra;
        String frase;

        System.out.println("Digite o seu nome completo:");
        nome = sc.nextLine();

        System.out.println("Seu nome tem " + nome.length() + " letras.");

        //2 — Peça o nome da pessoa e mostre ele  em MAIÚSCULO e em minúsculo.

        System.out.println("Digite o seu nome completo:");
        nome = sc.nextLine();

        System.out.println("O seu nome é " + nome.toUpperCase());
        System.out.println("O seu nome é " + nome.toLowerCase());

        //3 — Peça o nome da pessoa e mostre a primeira letra dele.

        System.out.println("Digite o seu nome completo:");
        nome = sc.nextLine();

        System.out.println("A primeira letra do seu nome é " + nome.charAt(0));

        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

        System.out.println("Digite uma frase:");
        frase = sc.nextLine();

        System.out.println("Agora digite uma palavra:");
        palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase? " + palavra.equals(frase));

        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite novamente:");
        nome2 = sc.nextLine();

        System.out.println("Os Nomes São Iguais? " + (nome.equalsIgnoreCase(nome2) ? "Sim" : "Não"));

    }
}
