package org.example.listas_revisao.lista_revisao2;

class Cachorro extends Pet {
    public Cachorro(String nome, String especie, String cor, double peso) {
        super(nome, especie, cor, peso);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}
