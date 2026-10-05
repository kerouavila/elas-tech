package org.example.A007.Scanner;

public class EstruturasRepeticao {
    static void main() {

        //1 - Mostre os números de 1 a 30, um por linha, usando for.

        for (int i = 1; i <= 30; i++) {
            System.out.println("Número " + i);
        }

        //2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".

        for (int i = 10; i >= 1; i--) {

            System.out.println("Número " + i);
        }
        System.out.println("Fim!");

        //3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
        int i = 1;
        while (i <= 30) {
            System.out.println("Número " + i);
            i++;
        }
        // No exercício 1, a repetição ficou mais objetiva e o código mais simples. No exercício 3, utilizando o While, entendo que a sintaxe é um
        //pouco mais "desorganizada", mas permite reaproveitar o valor informado em i para outras funções, já que ele não é colocado dentro do laço do While.


        //4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

        int numero = 5;
        i = 1;

        while (i <= 10) {
            System.out.println("O número " + numero + " multiplicado por " + i + " é igual a: " + (i*numero));
            i++;
        }
    }
}
