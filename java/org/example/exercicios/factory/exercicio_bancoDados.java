package org.example.exercicios.factory;

import java.util.Scanner;

public class exercicio_bancoDados {
    static void main() {
        /*public static void conectarBanco(BancoDeDados banco) {
           // System.out.println(banco.chamarBanco());
            //System.out.println("Número do banco: " + banco.getNumero());


        BancoDeDados Oracle = new Oracle();
        BancoDeDados MySql = new MySql();

        Oracle.chamarBanco();
        System.out.println("O número do Oracle é " + Oracle.getNumero());

        MySql.chamarBanco();
        System.out.println("O número do MySql é " + MySql.getNumero());*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o banco deseja usar? Digite \n 1 - MySql \n 2 - Oracle");
        int opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);
    }
}
