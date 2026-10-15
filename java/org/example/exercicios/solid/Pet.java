package org.example.exercicios.solid;

public class Pet {
    String nome;
    String especie;
    String cor;
    String porte;
    double peso;

    public String definirPorte() {

        if (peso < 3.5) {
            return "Pequeno";
        } else if (peso < 5) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public Pet(String nomeDigitado, String especieDigitado, String corDigitado, double pesoDigitado) {

        nome = nomeDigitado;
        especie = especieDigitado;
        cor = corDigitado;
        peso = pesoDigitado;
    }
}
