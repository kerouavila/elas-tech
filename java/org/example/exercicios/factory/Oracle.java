package org.example.exercicios.factory;

public class Oracle implements BancoDeDados{

    private int numero;

    public Oracle () {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O banco conectado é o Oracle.";

    }

    @Override
    public int getNumero() {
        return numero;
    }
}

