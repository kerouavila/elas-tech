package org.example.exercicios.lambda.exercicio2;

public class exercicio2 {

    public static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    public static void main() {
        repetir(() -> System.out.println("oi"));
    }

}
