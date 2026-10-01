package org.example.A006.Classe;

public class Classe {
    static void main() {

    double meuSaldo = 500.00;

    Roupa vestido = new Roupa();
    vestido.cor = "verde";
    vestido.curto = true;
    vestido.estampa = true;
    vestido.manga = "curta";
    vestido.preco = 199.90;

    Roupa camiseta = new Roupa();
    camiseta.cor = "preto";
    camiseta.estampa = false;
    camiseta.manga = "longa";
    camiseta.preco = 80.0;

    Roupa calca = new Roupa();
    calca.tecido = "jeans";
    calca.loja = 1;
    calca.preco = 600.0;

        System.out.println("Comprei um vestido e ele é " + vestido.cor + ".");
        System.out.println("Comprei uma calça " +calca.tecido + " na loja " + calca.loja + ", mas estava mais cara. Custou R$ " + calca.preco);
        System.out.println("Eu queria comprar uma calça " + calca.tecido + ", mas meu saldo é de R$ " + meuSaldo + " e a calça custa R$ " + calca.preco + ". Para conseguir comprar a calça, me falta R$ " + (calca.preco - meuSaldo));
    }
}
