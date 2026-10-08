package org.example.A014.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExercicioHashSet {
    static void main() {

        /*
        .add("Ana");
        .contains("Ana");
        .size();
        .isEmpty();
        .clear();
        new HashSet<>(lista);
        .addAll(List.of("Ana", "Bia", "Carla"));
        */

        //1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        //   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        //   com o repetido.

        HashSet<String> nomes = new HashSet<>();
        nomes.addAll(List.of("Rachel", "Eric", "Erica", "Erica"));

        System.out.println(nomes);
        System.out.println(nomes.size());

        //Observação: o nome "Erica", que foi repetido 2 vezes, teve um deles ignorado.


        //2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        //   de um if para avisar se a cor "verde" já está no conjunto ou não.

        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("Rosa", "Amarelo", "Roxo", "Preto", "Bege"));

        if (cores.contains("Verde")){
            System.out.println("A cor Verde está disponível no catálogo.");

        } else {
            System.out.println("A cor Verde não está disponível no catálogo.");
        }


        //3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
        //   tirar os repetidos. Imprima os dois e compare.

        ArrayList<String> nomesRepetidos = new ArrayList<>();
        nomesRepetidos.addAll(List.of("Rachel", "Rachel", "Eric", "Eric", "Erica", "Erica"));

        System.out.println(nomesRepetidos);

        HashSet<String> momesRepeditos = new HashSet<>();
        momesRepeditos.addAll(List.of("Rachel", "Rachel", "Eric", "Eric", "Erica", "Erica"));

        System.out.println(momesRepeditos);


        //4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        //   imprima de novo, junto com o tamanho.

        HashSet<String> cpf = new HashSet<>();
        cpf.addAll(List.of("000.000.000-00", "111.111.111-11", "222.222.222-22"));
        cpf.remove("000.000.000-00");

        System.out.println("Existem " + cpf.size() + " CPFs na lista. São eles: " + cpf);


        //5. Crie um HashSet com três frutas e percorra ele com for,
        //   imprimindo uma por linha.

        HashSet<String> frutas = new HashSet<>();
        frutas.addAll(List.of("Melão", "Bunana", "Kiwi"));

        int i = 1;
        for (String fruta : frutas) {
            System.out.println("Fruta " + i+ ": " + fruta);
            i++;
        }


        //6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        //   imprima o isEmpty() de novo.

        HashSet<String> vazio = new HashSet<>();
        vazio.addAll(List.of());

        System.out.println("A lista vazia está mesmo vazia? " + vazio.isEmpty());

        vazio.add("Plutão");

        System.out.println("A lista vazia está mesmo vazia? " + vazio.isEmpty() + ". A lista agora tem um: " + vazio);
    }
}
