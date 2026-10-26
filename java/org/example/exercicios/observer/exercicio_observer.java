package org.example.exercicios.observer;

public class exercicio_observer {
    static void main() {
        Canal canal = new Canal();

        Seguidor joao = new Seguidor("João");
        Seguidor maria = new Seguidor("Maria");

        canal.inscricao(joao);
        canal.inscricao(maria);

        canal.postarVideo("Video novo.");
    }

    //1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.
    //Resposta: ele atualiza automaticamente todos os dependentes de um objeto quando um estado é modificado. Exemplo do dia a dia: uma pessoa que escreve newsletter e tem vários inscritos. Quando ela publica a newsletter, todos os inscritos recebem o e-mail.

    //2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?
    //Resposta: é uma interface com o metodo que será chamado quando houver uma modificaççao. Os outros objetos precisam ser ter a dependência deste metodo para funcionar. E todos que têm a dependência são chamados de subject.

    //3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?

}

