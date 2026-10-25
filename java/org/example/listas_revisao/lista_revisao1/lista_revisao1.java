package org.example.listas_revisao.lista_revisao1;

import java.util.Scanner;

public class lista_revisao1 {
    static void main() {

        //Variáveis e tipos
        //Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
        //Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.

        int idade = 31;
        double altura = 1.62;
        double preco = 29.90;
        String nome = "Kerou";
        String cidade = "Salvador";
        String primeiroNome = "Kerou";
        String sobrenome = "de Avila";
        boolean jaProgramou = false;
        boolean temCarteira = true;

        int a = 10;
        int b = 20;
        int subtracao = b - a;
        int soma = a + a;

        System.out.println("Meu nome é " + nome);
        System.out.println("Eu tenho " + idade + " anos.");
        System.out.printf("Tenho %.2f metros de altura %n", altura);
        System.out.println("A Kerou já programou antes? " + jaProgramou);
        System.out.println("---------------------");
        System.out.println("Eu moro em " + cidade);
        System.out.println("Meu nom completo é " + primeiroNome + " " + sobrenome);
        System.out.printf("O preço da xícara é %.2f %n", preco);
        System.out.println("Tem carteira? " + temCarteira);
        System.out.println("O valor de A é " + soma);
        System.out.println("O valor de B é " + subtracao);

        System.out.println("---------------------");

        //Operadores
        //Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
        //Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
        //Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
        //Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
        //Crie um número e imprima o resto da divisão dele por 2.
        //Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
        //🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?

        int aA = 15;
        int bB = 4;
        int c = 10;
        int d = 10;
        int e = 13;
        int f = 3;
        int idade2 = 20;
        int h = 15;
        double g = 5.50;
        double total = f * g;
        double saldo = 1000;
        boolean temCarteira2 = true;
        boolean divisivelPor3e5 = (h % 3 == 0) && (h % 5 == 0);

        System.out.println("Soma: " + (aA + bB));
        System.out.println("Subtração: " + (aA - bB));
        System.out.println("Multiplicação: " + (aA * bB));
        System.out.println("Divisão: " + ((double) aA / bB));
        System.out.println("Resto: " + (aA % bB));
        System.out.println("---------------------");

        saldo += 250;
        saldo -= 380;

        System.out.println("Saldo final: " + saldo);
        System.out.println("---------------------");

        System.out.println("O número de C " + c + " é igual ao número de D " + d + "? " + (c == d));
        System.out.println("O número de C " + c + " é diferente de D " + d + "? " + (c != d));
        System.out.println("O número de C " + c + " é maior que D " + d + "? " + (c > d));
        System.out.println("O número C " + c + " é maior ou igual a D " + d + "? " + (c >= d));
        System.out.println("---------------------");

        System.out.println("Tem idade e carteira? " + (idade2 >= 18 && temCarteira2));
        System.out.println("---------------------");

        System.out.println("O resto da divisão de " + e + " por 2 é: " + (e % 2));
        System.out.println("---------------------");

        System.out.println("O total da compra é: R$ " + total);
        System.out.println("---------------------");

        System.out.println("O número " + h + " é divisível por 3 e 5 ao mesmo tempo? " + divisivelPor3e5);

        //Concatenação e printf
        //Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
        //Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
        //Crie uma variável com o preço de um produto e imprima com duas casas decimais.
        //Usando printf, imprima numa linha só o nome, a idade e a altura.
        //Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.

        String nome3 = "Rachel";
        int idade3 = 28;
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media2 = (nota1 + nota2) / 2;
        double preco2 = 49.90;

        String produto1 = "Caderno";
        double valor1 = 25.50;

        String produto2 = "Caneta";
        double valor2 = 4.75;

        String produto3 = "Mochila";
        double valor3 = 120.00;

        double totalValores = valor1 + valor2 + valor3;

        System.out.println(nome3 + " tem " + idade3 + " anos.");
        System.out.println("---------------------");

        System.out.printf("Média: %.2f%n", media2);
        System.out.println("---------------------");

        System.out.printf("Preço do produto: R$ %.2f%n", preco2);
        System.out.println("---------------------");

        System.out.printf("Me chamo %s, tenho %d anos e %.2f metros de altura %n", nome, idade, altura);
        System.out.println("---------------------");

        System.out.printf("%s: R$ %.2f%n", produto1, valor1);
        System.out.printf("%s: R$ %.2f%n", produto2, valor2);
        System.out.printf("%s: R$ %.2f%n", produto3, valor3);
        System.out.printf("Total da compra: R$ %.2f%n", total);
        System.out.println("---------------------");

        //Scanner
        //Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        //Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
        //Pergunte dois números e mostre a soma.
        //Pergunte a altura e o peso e imprima os dois numa frase.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome4 = sc.nextLine();
        System.out.println("Olá, " + nome4 + "!");

        System.out.print("Digite sua idade: ");
        int idade4 = sc.nextInt();
        int proximoAniversario = idade4 + 1;

        System.out.println("No próximo aniversário você fará " + proximoAniversario + " anos.");

        System.out.print("Digite um número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = sc.nextDouble();

        double soma2 = numero1 + numero2;
        System.out.println("A soma é: " + soma2);

        System.out.print("Digite sua altura: ");
        double altura2 = sc.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso2 = sc.nextDouble();

        System.out.println("Você tem " + altura + " metros de altura e pesa " + peso2 + " kg.");
    }
}
