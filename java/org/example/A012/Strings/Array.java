package org.example.A012.Strings;

import java.util.Scanner;

public class Array {
    static void main(String[] args) {

        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"Marina", "Alice", "Sabrina", "Sarah", "Bianca"};
        System.out.println("Primeiro nome: " + nomes[1]);
        System.out.println("Terceiro nome: " + nomes[3]);
        System.out.println("Último nome: " + nomes[4]);

        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        Scanner sc = new Scanner(System.in);

        int[] notas = {8, 6, 10, 7, 9};
        for(int i = 0; i < notas.length; i++){

            System.out.println("Nota " + i + ": " + notas[i]);

        }

        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        System.out.println("A soma é:" + (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]));

        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        int numeros;

            System.out.println("Digite 5 números: ");
            numeros = sc.nextInt();
}
}