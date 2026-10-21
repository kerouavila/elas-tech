package org.example.exercicios.interfaces.exercicio_interfaces;

public class classe_carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerado.");
    }
}
