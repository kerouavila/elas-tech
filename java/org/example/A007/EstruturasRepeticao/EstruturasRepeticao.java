package org.example.A007.EstruturasRepeticao;

import java.util.Scanner;

public class EstruturasRepeticao {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int opcao;
        String nomeProduto;

        System.out.println("O que você quer comprar hoje?");
        nomeProduto = sc.nextLine();
        System.out.println("Você escolheu: " + nomeProduto);

        do {

            System.out.println("Escolha uma opção: \n" + "1. Ver camisas \n" + "2. Ver calças \n" + "3. Ver vestidos \n" + "4. Ver casacos\n" + "5. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Camisas");
                    break;

                case 2:
                    System.out.println("Você escolheu: Calças");
                    break;

                case 3:
                    System.out.println("Você escolheu: Vestidos");
                    break;

                case 4:
                    System.out.println("Você escolheu: Casacos");
                    break;

                case 5:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        String nomeLanche;
        int precoLanche;
        double desconto = 5.0;

        System.out.println("Digite o nome do lanche: ");
        nomeLanche = sc.nextLine();
        System.out.println("Lanche adicionado: " + nomeLanche);

        System.out.println("Digite o preço do lanche: ");
        precoLanche = sc.nextInt();
        System.out.println("O preço do lanche é : " + "R$ " + precoLanche);

        if (precoLanche >= 30.0) {
            System.out.println("Você pode oferecer um cupom de desconto no valor de R$ " + desconto + ".");
            System.out.printf("O preço do lanche com o cupom aplicado fica: R$ %.2f.\n", precoLanche - desconto);
            System.out.println("Lanche e preço adicionados com sucesso");
        }

        else if (precoLanche <29.0) {
            System.out.println("Lanche e preço adicionados com sucesso.");
        }

        sc.close();

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
