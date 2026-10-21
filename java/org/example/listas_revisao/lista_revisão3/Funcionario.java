package org.example.listas_revisao.lista_revisão3;

abstract class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario (String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public String getNome () {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("O salário não pode ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
