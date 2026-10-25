package org.example.listas_revisao.lista_revisao2;

class Gato extends Pet {
    public Gato(String nome, String especie, String cor, double peso) {
        super(nome, especie, cor, peso);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}
