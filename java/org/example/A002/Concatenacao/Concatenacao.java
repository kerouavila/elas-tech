package org.example.A002.Concatenação;

public class Concatenacao {

    void main() {
        // Exercício 1:

        // Crie variáveis para:
        // - um nome,
        // - uma cidade
        // - uma idade.
        // Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos.

        String nome = ("Ana");
        String cidade = ("Salvador");
        int idade = 28;

        System.out.println(" Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos. ");

        // Exercício 2:

        // Crie variáveis para:
        // - o nome de um produto ("Caneca"),
        // - o preço (12.50)
        // - e a quantidade (4).
        // Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

        String produto = "Caneca";
        double preco = 12.5;
        int quantidade = 4;
        double total = 50.0;

        System.out.println(" Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + total);

        // Exercício 3:
        // Crie duas variáveis com números inteiros.
        // Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        int soma1 = 15;
        int soma2 = 4;

        System.out.println(" A soma de " + soma1 + " e " + soma2 + " é igual a " + (soma1+soma2) + ". ");
        System.out.println(" A multiplicação de " + soma1 + " e " + soma2 + " é igual a " + (soma1*soma2) + ". ");
        System.out.println(" A divisão de " + soma1 + " e " + soma2 + " é igual a " + (soma1/soma2) + ". ");
        System.out.println(" A subtração de " + soma1 + " e " + soma2 + " é igual a " + (soma1-soma2) + ". ");
    }
}
