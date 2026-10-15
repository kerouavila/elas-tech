package org.example.exercicios.heranca;

public class classe_gerente extends classe_funcionario implements interface_nootificavel, interface_exportavel {

    public void aprovarFerias(String quem) {

        System.out.println("O gerente aprovou as férias da funcionária " + quem);

    }

    @Override
    public void notificar(String mensagem) {

        System.out.println("Notificação para o gerente " + nome + ": " + mensagem);

    }

    @Override
    public void exportar() {

        System.out.println("Gerente " + nome + " gerou a tabela com as férias dos funcionários.");
    }
}

