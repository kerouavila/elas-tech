package org.example.listas_revisao.lista_revisao2;

import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Scanner;

public class projeto_petshop {
    static void main() {

        Scanner sc = new Scanner(System.in);

        Pet[] listaPets = new Pet[5];
        int opcao = -1;
        int total = 0;

        while (opcao != 0) {
            System.out.println("◃*───────────*▹ Bem-vindo ao petshop da Kerou! ◃*───────────*▹");
            System.out.println("Digite 1 para cadastrar um pet");
            System.out.println("Digite 2 para ver todos os pets cadastrados");
            System.out.println("Digite 3 para buscar um pet cadastrado");
            System.out.println("Digite 4 para ver quais espécies estão cadastradas");
            System.out.println("Digite 0 para sair");
            opcao = sc.nextInt();
            sc.nextLine();

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= listaPets.length) {
                            System.out.println("A lista de pets atingiu o limite. Para cadastrar mais pets, aumente o limite ou exclua um pet já cadastrado.");
                            break;
                        }

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
                        novoPet.porte = novoPet.definirPorte();

                        listaPets[total] = novoPet;
                        total++;

                        System.out.println("O novo pet " + nome + " foi cadastrado <3 Agora, temos " + total + " pet(s) no sistema.");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");

                        } else {
                            System.out.println("Pets cadastrados:");
                            for (int i = 0; i < total; i++) {
                                System.out.println(listaPets[i].nome + ": " + listaPets[i].especie + ", " + listaPets[i].cor + ", " + listaPets[i].peso + "kg, " + listaPets[i].porte);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Digite o nome do pet. Vamos buscar no sistema.");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (listaPets[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println("Encontrado: " + listaPets[i].nome + ": " + listaPets[i].especie + ", " + listaPets[i].cor + ", " + listaPets[i].peso + "kg, " + listaPets[i].porte);
                                achou = true;
                            }

                            if (!achou) {
                                System.out.println("Não encontrei um pet com este nome.");
                            }
                            break;
                        }

                    case 4:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastradoop.");
                        } else {
                            HashSet<String> especiesUnicas = new HashSet<>();

                            for (String especieUnica : especiesUnicas) {
                                System.out.println("- " + especieUnica);
                            }

                            System.out.println("Total de especies cadastradas no sistema: " + especiesUnicas.size());
                        }
                        break;

                    case 0:
                        System.out.println("Tudo bem. Volte sempre!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite apenas números.");
                sc.nextLine();
            }
        }
    }
}