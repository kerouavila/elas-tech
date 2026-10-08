package org.example.A015.ArrayDeque;

import org.example.A009.Arrays.Array;

import java.util.ArrayDeque;
import java.util.List;

public class ExercicioArrayDeque {
    static void main() {

        /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */

        //1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
        //   e quantas pessoas tem.

        ArrayDeque<String> nomes = new ArrayDeque<>();
        nomes.add("Erica");
        nomes.add("Eric");
        nomes.add("Rachel");

        System.out.println("A fila tem os nomes: " + nomes);
        System.out.println("A fila tem um total de " + nomes.size() + " pessoas");


        //2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        //   imprima a fila logo depois. Repare que ela não mudou.

        ArrayDeque<String> patos = new ArrayDeque<>();
        patos.addAll(List.of("pato 1","pato 2", "pato 3", "pato 4", "pato 5"));

        System.out.println("O próximo patinho que vai passear é: " + patos.peek());

        System.out.println(patos);


        //3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        //   depois. Compare com o exercício 2.

        System.out.println("O próximo patinho que vai passear é: " + patos.poll());
        System.out.println(patos);

        //Observação: usar o .peek no exercício 2 apenas mostrou quem era o próximo pato na fila, mas não o "chamou". Usar o .poll no exercício 3
        // mostrou o próximo pato na fila e o "descartou".


        //4. Crie uma fila com três nomes e atenda todos usando
        //   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> nomes2 = new ArrayDeque<>();
        nomes2.addAll(List.of("Erica", "Eric", "Rachel"));

        while (!nomes2.isEmpty()){

            System.out.println("O próximo da fila é: " + nomes2.poll());
            System.out.println("O próximo da fila é: " + nomes2.poll());
            System.out.println("O próximo da fila é: " + nomes2.poll());
            System.out.println("Fila vazia!");

        }

        //5. Crie uma fila com três nomes e use contains para responder duas
        //   perguntas: se "Bia" está na fila e se "Eric" está.

        ArrayDeque<String> nomes3 = new ArrayDeque<>();
        nomes3.addAll(List.of("Erica", "Eric", "Rachel"));

        System.out.println("O nome 'Bia' está na lista? " + nomes3.contains("Bia"));
        System.out.println("O nome 'Eric' está na lista? " + nomes3.contains("Eric"));


        //6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        //   - se estiver vazia  -> "Não tem ninguém na fila."
        //   - se tiver gente    -> "Próximo: [nome]"
        //   Depois adicione uma pessoa e teste de novo.

        ArrayDeque<String> fila2 = new ArrayDeque<>();

        System.out.println("A fila está vazia?");

        if (fila2.isEmpty()) {
            System.out.println("Sim, a fila está vazia.");

        } else {
            System.out.println("Não, o próximo da fila é: " + fila2.peek());
        }

        fila2.add("pato1");
        System.out.println("A fila está vazia?");

        if (fila2.isEmpty()) {
            System.out.println("Sim, a fila está vazia.");

        } else {
            System.out.println("Não, o próximo da fila é: " + fila2.peek());
        }

    }
}
