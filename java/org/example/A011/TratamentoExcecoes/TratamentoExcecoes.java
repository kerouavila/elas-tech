package org.example.A011.TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    static void main() {

        //1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo,
        // trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n1 = sc.nextInt();

        System.out.println("Digite outro número inteiro:");
        int n2 = sc.nextInt();

        try {
            int divisao = n1 / n2;
            System.out.println("A divisão dos números é: " + divisao);

        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");
        }

        //2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir,
        // trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

        int[] notas = {1, 2, 3, 4, 5};

        System.out.println("Escolha uma posição entre 0 e 4:");
        int posicao = sc.nextInt();

        try {
            System.out.println(notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A posição não existe. Por favor, escolha uma posição entre 0 e 4.");
        }


        //3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número,
        // trate a InputMismatchException e mostre uma mensagem pedindo um número.

        System.out.println("Informe a sua idade:");

        try {
            int idade = sc.nextInt();
            System.out.println("A sua idade é: " + idade);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, informe apenas um número para a sua idade.");
        }

        //4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."

        String nome = null;

        try {
            System.out.println(nome.length());

        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido");
        }


        //5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

        System.out.println("Digite um número: ");
        int n3 = sc.nextInt();

        try {
            System.out.println("A divisão de 100 pelo número " + n3 + " é: " + (100 / n3));

        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");
        }


        //6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem
        // "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

        String[] nomes = {"Erica", "Eric", "Rachel"};

        try {
            System.out.println("O quinto nome é: " + nomes[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esta posição não existe.");
        }

        System.out.println("O programa continua funcionando.");

    }
}
