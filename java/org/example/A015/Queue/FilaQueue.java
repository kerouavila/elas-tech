package org.example.A015.Queue;

import org.example.A012.Strings.Array;

import java.util.ArrayDeque;
import java.util.List;

public class FilaQueue {
    static void main() {

        /*
        .add("Ana"); - adiciona um valor
        .peek(); - ve o primeiro
        .poll(); - manda um elemento embora
        .isEmpty();
        .size(); usa no for
        .contains("Bia");
        .addAll(List.of("Ana","Bia")); - adiciona todos os elementos, exibe
        */

        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Flore");
        fila.add("Rachel");
        fila.addAll(List.of("Eric", "Erica", "Rachel"));
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);
        fila.poll();
        System.out.println(fila);

        if (fila.isEmpty() != true){
            System.out.println("Adicione valores na fila");
        } else {
        }
    }
}
