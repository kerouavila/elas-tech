package org.example.exercicios.lambda.exercicio1;

public class exercicio {
    static void main() {
        Saudacao saudacao = () -> System.out.println("oi");

        saudacao.executar();

        //2
        Impressora impressoraMaiuscula = (String texto) -> { System.out.println(texto.toUpperCase());
        };
        Impressora impressoraMinuscula = (String texto) -> { System.out.println(texto.toLowerCase());
        };

        impressoraMaiuscula.imprimir("Olá, mundo do Java!");
        impressoraMinuscula.imprimir("Olá, mundo do Java!");

        //3
        Calcular soma = (a, b) -> a + b;
        Calcular multiplicacao = (a, b) -> a * b;
        Calcular maior = (a, b) -> Math.max(a, b);

        int num1 = 10;
        int num2 = 7;

        System.out.println("Soma (" + num1 + " + " + num2 + "): " + soma.calcular(num1, num2));
        System.out.println("Multiplicação (" + num1 + " * " + num2 + "): " + multiplicacao.calcular(num1, num2));
        System.out.println("Maior entre " + num1 + " e " + num2 + ": " + maior.calcular(num1, num2));
    }
}
