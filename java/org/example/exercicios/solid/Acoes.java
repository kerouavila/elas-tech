package org.example.exercicios.solid;

import java.util.Scanner;

public class Acoes {

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        Pet[] listaPets = new Pet[5];
        int opcao = -1;
        int total = 0;

        while (opcao != 0) {
            System.out.println("◃*───────────*▹ Bem-vindo ao petshop da Kerou! ◃*───────────*▹");
            System.out.println("Digite 1 para cadastrar um pet");
            System.out.println("Digite 2 para listar os pets cadastrados");
            System.out.println("Digite 0 para sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Vamoos continuar com o cadastro do pet. Por favor, digite o nome do seu pet:");
                    String nome = sc.nextLine();

                    System.out.println("Digite a espécie do " + nome + ":");
                    String especie = sc.nextLine();

                    System.out.println("Qual é a cor do " + nome + "?");
                    String cor = sc.nextLine();

                    System.out.println("Qual o peso do " + nome + "?");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    Pet novoPet = new Pet(nome, especie, cor, peso);

                    listaPets[total] = novoPet;
                    total++;

                    System.out.println("O novo pet " + nome + " foi cadastrado <3 Agora, temos " + total + " pet(s) no sistema.");
                    break;

                case 2:
                    System.out.println("Quantidade de pets cadastrados:");

                    if (total == 0){
                        System.out.println("Nenhum pet cadastrado ainda :(");

                    }else {

                        for (int i = 0; i < total; i++) {
                            System.out.println((i+1) + ". " + listaPets[i].nome);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Tudo bem. Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
