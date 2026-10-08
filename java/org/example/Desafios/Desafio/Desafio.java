package org.example.Desafios.Desafio;

import java.util.Scanner;

public class Desafio {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int opcao;
        String resultado;

        do {
            System.out.println("Deseja cadastrar uma Aluna?\nDigite 1 para continuar;\nDigite 2 para sair.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Informe a primeira nota da aluna:");
                    aluna.nota1 = sc.nextDouble();

                    System.out.println("Informe a segunda nota da aluna:");
                    aluna.media = sc.nextDouble();

                    aluna.media = (aluna.nota1 + aluna.nota2) /2;
                    System.out.printf("A média da aluna é: %.1f\n", aluna.media);

                    if (aluna.media >= 7){
                        aluna.passou = true;
                        resultado = "aprovada";
                    } else {
                        aluna.passou = false;
                        resultado = "reprovada";
                    }

                    System.out.println("Informe o nome da aluna:");
                    aluna.nome = sc.nextLine();
                    sc.nextLine();

                    System.out.println("A aluna " + aluna.nome + "tem uma nota média de " + aluna.media + "e está " + resultado);


                case 2:
                    System.out.println("Operação encerrada.");
            }

        } while (opcao != 1);

    }
}