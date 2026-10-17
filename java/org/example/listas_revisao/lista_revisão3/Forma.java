package org.example.listas_revisao.lista_revisão3;

abstract class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Nome da forma é: " + nome);
    }

    public abstract double calcularArea();
}
