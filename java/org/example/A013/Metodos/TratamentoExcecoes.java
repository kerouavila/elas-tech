package org.example.A013.Metodos;

import java.util.Scanner;

public class TratamentoExcecoes {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite um número:");
        numero1 = sc.nextInt();

        System.out.println("Digite outro número:");
        numero2 = sc.nextInt();

        System.out.printf("A divisão do primeiro número pelo segundo número é: %.2f.\n", numero1 / numero2);

        try {

        } catch (ArithmeticException e) {

            System.out.println("Não é possível dividir por 0! Escreva outro número");
        }

        // exercício 2

        int[] notas = {1, 3, 13, 3, 1};
        int posicao;

        System.out.println("Escolha um número de 0 a 4 para receber uma nota");

        try {
            posicao = sc.nextInt();

            System.out.println("Você recebeu a nota: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("A posição não existe, por favor, digite um número de 0 a 4.");
        }

        // exercicio 3

        String nome;
        System.out.println("Informe seu nome");
    }
}
