package org.example.A014.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    static void main() {

        /*.add(); - adiciona um elemento na lista, informando a posição onde o elemento vai ser inserido. Se nao informar a posição, ele joga pro fim da lista
        .get(); - acessa a lista e informa a posição em que está a informação
        .size(); - informa o tamanho da lista, a quantidade de elementos
        .contains(); - informa se o valor informado tem na lista, true or false
        .indexOf(); - fala a posição na lista do item informado
        .remove(); - retira um item da lista
        .set(); -
        System.out.println(lista.isEmpty()); fala se a lista esta vazia ou nao
        .addAll(List.of()); cita o conteudo integral de dentro da lista */

        ArrayList<Integer> lista = new ArrayList();

        lista.add(1);
        lista.addAll(List.of(1, 4, 67, 89, 12, 13, 24, 33));
        System.out.println(lista);
        lista.get(3);
        System.out.println(lista.get(3));
        lista.remove(1);
        System.out.println(lista);

        lista.set(0, 666);
        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.contains(89));
        System.out.println(lista.contains(0));

        lista.add(0, 6666);
        System.out.println(lista);

        lista.add(9999);
        System.out.println(lista);

        System.out.println(lista.indexOf(89));




    }
}
