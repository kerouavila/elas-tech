package org.example.exercicios.construtor;

import org.example.exercicios.singleton.testeSingleton;

public class exercicio_construtor {
    static void main() {
        Bebe erica = new Bebe ("Érica", "15/02/2032");
        System.out.println("O bebe se chama " + erica.nome + " e vai nascer em " + erica.dataNascimento);

        Bebe kerou = new Bebe("Kerou", "15/06/1995");
        System.out.println("A " + kerou.nome + " nasceu em " + kerou.dataNascimento + " e já não é mais um bebê.");

        Bebe bilbo = new Bebe("Bilbo", "17/04/2016");
        System.out.println("O " + bilbo.nome + " é o primeiro bebê da " + kerou.nome + " e nasceu em " + bilbo.dataNascimento + " e é um gato frajola.");

        Bebe nena = new Bebe("Nena", "20/09/2018");
        System.out.println("O gato " + nena.nome + " é o segundo bebê da " + kerou.nome + " e nasceu em " + nena.dataNascimento);

        Bebe salem = new Bebe("Salem", "05/02/2020");
        System.out.println("O " + salem.nome + " é um lindo gatinho nascido em " + salem.dataNascimento + " e é o bebezinho da casa.");
    }

    testeSingleton teste = testeSingleton.getInstancia();
    testeSingleton teste2 = testeSingleton.getInstancia();
    testeSingleton teste3 = testeSingleton.getInstancia();
}
