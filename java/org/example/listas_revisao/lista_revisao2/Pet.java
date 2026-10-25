package org.example.listas_revisao.lista_revisao2;

public class Pet {
    String nome;
    String especie;
    String cor;
    double peso;
    String porte;

    public Pet(String nome, String especie, String cor, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
        this.peso = peso;
        this.porte = definirPorte();
    }

    String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    void emitirSom() {
        System.out.println(nome + " faz: som genérico");
    }
}

