package org.example.listas_revisao.lista_revisao2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class projeto_petshop {

    static void exibirFichaPet(Pet p) {
        System.out.println("Nome: " + p.nome);
    }

    static void exibirFichaPet(Pet p, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + p.nome);
        System.out.println("Espécie: " + p.especie);
        System.out.printf("Peso: %.1f kg\n", p.peso);
        System.out.println("Porte: " + p.porte);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pet> listaPets = new ArrayList<>();
        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n◃*───────────*▹ Bem-vindo ao petshop da Kerou! ◃*───────────*▹");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pet cadastrado");
            System.out.println("4 - Ver espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo da fila");
            System.out.println("7 - Executar serviços (Banho, Tosa, Consulta)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Por favor, digite o nome do seu pet:");
                        String nome = sc.nextLine();

                        System.out.println("Digite a espécie do " + nome + ":");
                        String especie = sc.nextLine();

                        System.out.println("Qual é a cor do " + nome + "?");
                        String cor = sc.nextLine();

                        System.out.println("Qual o peso do " + nome + "?");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Pet novoPet;
                        if (especie.equalsIgnoreCase("cachorro")) {
                            novoPet = new Cachorro(nome, especie, cor, peso);
                        } else if (especie.equalsIgnoreCase("gato")) {
                            novoPet = new Gato(nome, especie, cor, peso);
                        } else {
                            novoPet = new Pet(nome, especie, cor, peso);
                        }

                        listaPets.add(novoPet);
                        System.out.println("O novo pet " + nome + " foi cadastrado <3 Agora, temos " + listaPets.size() + " pet(s) no sistema.");
                        break;

                    case 2:
                        if (listaPets.isEmpty()) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n--- PETS CADASTRADOS ---");
                            for (Pet p : listaPets) {
                                System.out.println(p.nome + " (" + p.especie + ") - " + p.peso + " kg - Porte " + p.porte);
                                p.emitirSom();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Qual pet você procura?");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (Pet p : listaPets) {
                            if (p.nome.equalsIgnoreCase(busca)) {
                                System.out.println("Encontrado: " + p.nome + " (" + p.especie + ") - " + p.peso + " kg - Porte " + p.porte);
                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        if (listaPets.isEmpty()) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            HashSet<String> especiesUnicas = new HashSet<>();
                            for (Pet p : listaPets) {
                                especiesUnicas.add(p.especie);
                            }

                            System.out.println("\n--- ESPÉCIES CADASTRADAS ---");
                            for (String especieUnica : especiesUnicas) {
                                System.out.println("- " + especieUnica);
                            }
                            System.out.println("Total de espécies diferentes: " + especiesUnicas.size());
                        }
                        break;

                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();
                        filaBanho.add(nomeFila);
                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);
                        break;

                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("A fila está vazia.");
                        } else {
                            String proximo = filaBanho.peek();
                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            filaBanho.poll();
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;

                    case 7:
                        System.out.print("Nome do pet para os serviços: ");
                        String nomeServico = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();
                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico s : servicos) {
                            s.executar(nomeServico);
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}