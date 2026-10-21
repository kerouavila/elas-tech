package org.example.exercicios.construtor.exercicio_construtor2;

public class exercicio_construtor2 {
    static void main() {

        Agendamento pet1 = new Agendamento("Bilbo", "Exame", "8h", false, false, false, "não tem um canino", 0.10);
        pet1.mostrar();

        System.out.println("-----------------------------------");

        Agendamento pet2 = new Agendamento("Luna", "Tosa", "10h", false, false, false, "Nenhuma observação", 0.00);
        pet2.mostrar();

        System.out.println("-----------------------------------");

        Agendamento pet3 = new Agendamento("Mel", "Banho", "16h", false, false, true, "Nenhuma observação", 0.00);
        pet3.mostrar();

        // Não dá pra saber o que está sendo negado ou aprovado no true e false das linhas. Eu precisei consultar na classe Agendamento para saber o que era o que.

        // Para o código não teria problema invernet o false com o true de ordens, pois em ambos o construtor está esperando um valor para o boolean. Conceitualmente teria um problema no cadastro do pet pois algum serviço desejado não seria prestado ou trocado por outro que foi negado,

        // Tive que escrever 3 vezes false para negar os serviços adicionais do agendamento do pet2. Seria mais fácil ter um scanner perguntando se a pessoa quer adicionais, assim em caso de não, fica uma resposta para tudo.
    }




}
