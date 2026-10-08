package org.example.A013.HashMap;

import java.util.HashMap;

public class ExercicioHashMap {
    static void main() {

        /*..put("Ana", 28);
        .get("Ana"); - retonar a informação que foi identificada na lista
        .getOrDefault("Zoe", 0); - retorna uma mensagem de erro para caso o usuario procure algo que nao existe
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        //1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        //   inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Érica", 10);
        pessoas.put("Eric", 11);
        pessoas.put("Rachel", 31);

        System.out.println(pessoas);
        System.out.println(pessoas.get("Érica"));


        //2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
        //   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
        //   Imprima outra vez e veja o que aconteceu com o tamanho.

        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("Café", 5.00);
        System.out.println(produtos);

        produtos.put("Café", 7.50);
        System.out.println(produtos);


        //3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
        //   dentro de um if para mostrar o telefone de alguém que está na agenda
        //   e de alguém que não está.

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Rachel", "(53) 1234-5678");
        agenda.put("Raquel", "(53) 9012-3456");

        if (agenda.containsKey("Rachel")){
            System.out.println("Encontrei o telefone: " + agenda.get("Rachel"));

        } else {
            System.out.println("Este telefone não está cadastrado.");
        }

        if (agenda.containsKey("Eric")){
            System.out.println("Encontrei o telefone: " + agenda.get("Eric"));

        } else {
            System.out.println("O telefone de Eric não está cadastrado.");
        }


        //4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        //   Use getOrDefault para mostrar a quantidade de um produto que existe
        //   e de um que não existe (devolvendo 0). Depois tente com get normal
        //   no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Caneta", 2000);
        estoque.put("Lapiseira", 3000);

        System.out.println("O estoque contém " + estoque.getOrDefault("caneta", 2000) + " canetas.");
        System.out.println("O estoque contém " + estoque.getOrDefault("Livros", 0) + " livros.");
        System.out.println(estoque.get("livros"));


        //5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
        //   Remova uma delas e imprima de novo.

        HashMap<String, Integer> alunas = new HashMap<>();
        alunas.put("Rachel", 10);
        alunas.put("Andrea", 9);
        alunas.put("Fernanda", 10);

        System.out.println("Todas as alunas: " + alunas);
        System.out.println("Quantidade de alunas: " + alunas.size());

        alunas.remove("Fernanda");
        System.out.println("Todas as alunas: " + alunas);
        System.out.println("Quantidade de alunas: " + alunas.size());

    }
}
