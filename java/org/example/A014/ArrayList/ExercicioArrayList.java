package org.example.A014.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayList {
    static void main() {

        //- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.addAll(List.of("Érica", "Eric", "Rachel"));
        System.out.println(listaNomes);


        //- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.addAll(List.of("Morango", "Banana", "Kiwi"));
        System.out.println(listaFrutas.get(0));
        System.out.println(listaFrutas.get(2));
        System.out.println("A lista tem um total de: " + listaFrutas.size() + " frutas.");


        //- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList<String> listaNomes2 = new ArrayList<>();
        listaNomes2.addAll(List.of("Érica", "Eric", "Rachel", "Ellen"));
        System.out.println(listaNomes2);
        listaNomes2.set(1,"Clapton");
        System.out.println(listaNomes2);


        //- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String> listaCidades = new ArrayList<>();
        listaCidades.addAll(List.of("Curitiba", "Rio Grande", "Pelotas", "Rio Verde"));
        listaCidades.remove(0);
        System.out.println("Eram quatro cidades. Removendo a primeira, sobram: " + listaCidades.size());


        //- Crie uma lista com seis nomes e imprima usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList<String> listaNomes3 = new ArrayList<>();
        listaNomes3.addAll(List.of("Érica", "Eric", "Clapton", "Rachel", "Ellen", "Lupton"));

        for (int i = 0; i < listaNomes3.size(); i++){
            System.out.println(i + ": " + listaNomes3.get(i));
        }


        //- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNomes4 = new ArrayList<>();
        listaNomes4.addAll(List.of("Érica", "Eric", "Clapton", "Rachel"));

        System.out.println("Digite um nome:");
        String nome = sc.nextLine();

        int posicao = listaNomes4.indexOf(nome);

        if (posicao != -1) {
            System.out.println("O nome informado está na lista, na posição: " + posicao);
        } else {
            System.out.println("O nome não está na lista.");
        }

    }
}
