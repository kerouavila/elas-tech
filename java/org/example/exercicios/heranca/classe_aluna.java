package org.example.exercicios.heranca;

public class classe_aluna extends classe_pessoa {
    String curso = "Design";

    public void estudar(){
        System.out.println(nome + " está estudando " + curso);
    }
}
