package org.example.A016.ForEach;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ExercicioForEach {
    static void main() {

        //1
        String[] nomes = {"Erica", "Eric", "Rachel", "Ellen"};

        for (String nome : nomes){
            System.out.println(nome);
        }

        //2
        ArrayList<Integer> notas = new ArrayList<>();
        notas.addAll(List.of(10, 100, 1000, 10000, 100000));

        for (Integer nota : notas) {
            System.out.println(nota);
        }

        //3
        ArrayList<Integer> notas2 = new ArrayList<>();
        notas2.addAll(List.of(8, 6, 10, 7));
        int soma = 0;

        for (Integer nota : notas2) {
            soma = soma + nota;
        }

        int media = soma / notas.size();

        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);

        //4
        String[] nomes2 = {"Eric", "Erica", "Keroulaine"};

        int letras = 0;

        for (String nome : nomes2) {
            if (nome.length() > 5) {
                letras = letras + 1;
            }
        }

        System.out.println("Noms com mais de 5 letras: " + letras);

        //5
        String[] nomes3 = {"Erica", "Eric", "Rachel", "Ellen"};

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
