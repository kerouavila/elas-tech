package org.example.A013.Metodos;

import java.util.Scanner;


public class Metodos {
    static void main(String[] args) {

        //1 — Na mesma classe do main, crie um metodo chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
        saudar();


        //2 — Crie um metodo saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
        Utilidades.saudacao("Érica");
        Utilidades.saudacao("Eric");
        Utilidades.saudacao("Rachel");

        //3 — Crie um metodo dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
        Utilidades.dobro(6.5);

        //4 — Crie um metodo calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe outra nota: ");
        double n2 = sc.nextDouble();

        double media = Utilidades.calcularMedia(n1, n2);

        System.out.printf("A média das notas é: %.1f%n", media);

        //5 — Crie um metodo ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do metodo dentro de um if para imprimir se a pessoa é maior ou menor de idade.

    }

    static void saudar() {
        System.out.println("Bem-vinda ao curso de Java!");
    }
}
