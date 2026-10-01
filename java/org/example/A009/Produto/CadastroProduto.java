package org.example.A009.Produto;

import java.util.Scanner;

public class CadastroProduto {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Produto produto = new Produto();

            System.out.println("Informe o nome do produto que você quer cadastrar: ");
            produto.nome = sc.nextLine();

            System.out.println("Informe o preço do produto: ");
            produto.preco = sc.nextDouble();
            sc.nextLine();

            if (produto.preco > 100.0) {
                System.out.printf("O produto %s tem o valor de %.2f. Produto caro!\n", produto.nome, produto.preco);

            } else if (produto.preco <99.9){
                System.out.println("Produto com preço acessível!");
            }
        }
    }
}
