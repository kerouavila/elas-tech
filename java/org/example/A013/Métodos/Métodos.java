package org.example.A013.Métodos;

import java.util.Scanner;

import static org.example.A013.Métodos.MetodosCadastrados.*;

public class Métodos {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mostrarBoasVindas();

        System.out.println(dobro(3));

        saudar("Amanda");

        System.out.println("Digite um número:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite um segundo número:");
        double nota2 = sc.nextDouble();
        double media = calcularMedia(nota1, nota2);

        System.out.printf("A média das notas é: %.1f%n", media);

        System.out.println("Informe a sua idade");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");

        } else if (idade <= 17) {
            System.out.println("Você é menor de idade");
        }


    }

    public static void mostrarBoasVindas(){
        System.out.println("Bem-vinda ao curso de Java!");
    }


}
