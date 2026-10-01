package org.example.A005.EstruturasDecisão;

public class EstruturasDecisao {

    void main() {

        // Crie uma variável idade e mostre a categoria de uma pessoa:
        // menos de 13 anos é "Criança";
        // de 13 a 17 é "Adolescente";
        // de 18 a 59 é "Adulto"
        // 60 ou mais é "Idoso".

        int idade = 43;

        if (idade < 13 ) {
            System.out.println("Criança");
        }
        else if (idade >= 13 & idade <= 17){
            System.out.println("Adolescente");
        }
        else if (idade >=18 & idade <=59){
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }

        //Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
        // Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante.
        // Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldoConta = 500.00;
        double valorCompra = 820.00;

        if (valorCompra <= 500.00){
            System.out.println(" Compra aprovada! Sobrou: " + (saldoConta - valorCompra) + " de saldo." );
        }
        else {
            System.out.println("Saldo insuficiente. Falta: " + (valorCompra - saldoConta) );
        }

        // Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio:
        // 1 é Café
        // 2 é Cappuccino
        // 3 é Chocolate quente
        // 4 é Chá.
        // Qualquer outro número mostra "Opção inválida".

        int opcao = 6;

        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;

            case 2:
                System.out.println("Cappuccino");
                break;

            case 3:
                System.out.println("Choco quente");
                break;

            case 4:
                System.out.println("Chá");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        // Crie variáveis
        // idade (17) e temAutorizacao (true).
        // Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização.
        // Faça o mesmo para precisa ter 18 anos e ter autorização.

        int idade1 = 18;
        boolean temAutorizacao = true;

        if (idade1 >= 18 || temAutorizacao == true) {
            System.out.println("Acesso liberado.");
        }
        else {
            System.out.println("Acesso negado.");
        }

        if (idade1 >= 18 & temAutorizacao == false) {
            System.out.println("Acesso liberado.");
        }
        else  {
            System.out.println("Acesso negado.");
        }


        // Desafio:
        // Crie variáveis para três notas de uma aluna. Calcule a média e mostre:
        // "Aprovada" se for 7 ou mais,
        // "Recuperação" entre 5 e 6.9
        // "Reprovada" abaixo de 5.
        // Mostre também a média na tela. Valores:
        // nota1 = 5.3
        // nota2 = 7.8
        // nota3 = 4.5.
        //System.out.printf("Sua média é: %.2f\n", media);

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada");
        }
        else if (media >=5 & media <=6.9) {
            System.out.println("em recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

    }

}