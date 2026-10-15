package org.example.exercicios.heranca;

public class classe_professora extends classe_pessoa {

    String disciplina;

    public void lancarNota(String nomeAluna, double nota) {
        System.out.printf("A professora %s lançou nota %.1f para %s.%n", nome, nota, nomeAluna);
    }

    @Override
    public void apresentar(){
        System.out.println("Olá, eu sou a professora " + nome + " e ensino a disciplina de " + disciplina);
    }
}
