package org.example.A003.OperadoresAritmeticos;

public class OperadoresAritméticos {
    static void main() {
        // Exercício 1:
        // Rode o código:
        System.out.println("2 + 2 = " + 2 + 2);

        // Agora rode:
        System.out.println("2 + 2 = " + (2 + 2));

        // Explique em um comentário por que deram resultados diferentes:
        // R: Na primeira linha, foi feita apenas a concatenação dos valores, mostrando eles um ao lado do outro e passando
        // a ideia de que o resultado da soma é 22. No segundo código, foram inserido os parênteses para o código fazer, de fato, o cálculo matemático, exibindo o resultado correto.

        // Exercício 2:
        // Crie variáveis para dois números inteiros de valor:
        // a = 10
        // b = 3
        // mostre na tela: soma, subtração, multiplicação, divisão e resto.

        int a = 10;
        int b = 3;

        System.out.println("10 + 3 = " + (a + b));
        System.out.println("10 - 3 = " + (a - b));
        System.out.println("10 x 3 = " + (a * b));
        System.out.println("10 / 3 = " + (a / b) + ", sobrando apenas " + (a % b));

        // Exercício 3:
        // Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.

        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;

        System.out.println("8 + 6 + 10 = " + (nota1 + nota2 + nota3));
        System.out.println("a média das notas é = " + (nota1 + nota2 + nota3) / 3);

        // Exercício 4:
        // a = 3
        // b = 4
        // c = 5
        // Faça a operação a + b * c

        int valorA = 3;
        int valorB = 4;
        int valorC = 5;

        System.out.println("A operação de A + B x C é = " + (valorA + valorB * valorC));
        System.out.println("A operação de (a+b) x C é = " + (valorA + valorB) * valorC);
    }
}
