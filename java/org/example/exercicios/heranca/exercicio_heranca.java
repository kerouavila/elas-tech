package org.example.exercicios.heranca;

public class exercicio_heranca {
    static void main() {

        //1
        classe_aluna aluna1 = new classe_aluna();

        aluna1.nome = "Rachel";
        aluna1.idade = 21;
        aluna1.apresentar();

        aluna1.apresentar();


        //2
        aluna1.estudar();


        //3
        classe_professora professora1 = new classe_professora();
        professora1.nome = "Érica";
        professora1.disciplina = "História, teoria e crítica do design";

        aluna1.apresentar();
        professora1.lancarNota("Rachel", 10.0);


        //4
        aluna1.apresentar();
        professora1.apresentar();


        //5
        classe_diretora diretoria = new classe_diretora();
        diretoria.nome = "Ellen";

        diretoria.baterPonto();
        diretoria.aprovarFerias("Rachel");
        diretoria.definirMeta("aprovar 10 férias no mês.");


        //6
        classe_gerente gerente = new classe_gerente();
        gerente.nome = "Clapton";

        gerente.baterPonto();
        gerente.aprovarFerias("Rachel");
        gerente.notificar("você bateu a meta de férias aprovadas! Weeeee!");
        gerente.exportar();

        // Tentei colocar uma segunda classe no extends, mas a linha ficou com erro e não permitiu exportar mais de uma classe.
    }
}
