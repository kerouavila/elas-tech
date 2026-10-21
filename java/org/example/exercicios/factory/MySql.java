package org.example.exercicios.factory;

public class MySql implements BancoDeDados{

    private int numero;

    public MySql () {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O banco conectado é o MySql";

    }

    @Override
    public int getNumero() {
        return numero;
    }
}
