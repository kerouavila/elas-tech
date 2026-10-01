package org.example.A007.Scanner;

import java.util.Scanner;

public class While {
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
    }
}
