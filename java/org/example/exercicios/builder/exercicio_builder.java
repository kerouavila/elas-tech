package org.example.exercicios.builder;

public class exercicio_builder {
    static void main() {

        Agendamento pet1 = new Agendamento.Builder("Bilbo", "Exame", "8h")
                .comPerfume(false)
                .comLaco(false)
                .observacao("Não tem 1 dos caninos")
                .desconto(0.10)
                .build();

        pet1.mostrar();

        Agendamento pet2 = new Agendamento.Builder("Luna", "Tosa", "10h")
                .build();

        pet2.mostrar();

        Agendamento pet3 = new Agendamento.Builder("Mel", "Banho", "16h")
                .comHidratacao(true)
                .build();

        pet3.mostrar();
    }
}
