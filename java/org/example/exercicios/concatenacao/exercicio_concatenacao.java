package org.example.exercicios.concatenacao;

public class exercicio_concatenacao {

    void main() {

        //1
        String nome = ("Ana");
        String cidade = ("Salvador");
        int idade = 28;

        System.out.println(" Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos. ");

        //2:
        String produto = "Caneca";
        double preco = 12.5;
        int quantidade = 4;
        double total = 50.0;

        System.out.println(" Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + total);

        //3:
        int soma1 = 15;
        int soma2 = 4;

        System.out.println(" A soma de " + soma1 + " e " + soma2 + " é igual a " + (soma1+soma2) + ". ");
        System.out.println(" A multiplicação de " + soma1 + " e " + soma2 + " é igual a " + (soma1*soma2) + ". ");
        System.out.println(" A divisão de " + soma1 + " e " + soma2 + " é igual a " + (soma1/soma2) + ". ");
        System.out.println(" A subtração de " + soma1 + " e " + soma2 + " é igual a " + (soma1-soma2) + ". ");
    }
}
