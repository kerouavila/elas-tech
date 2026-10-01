package org.example.A007.Scanner;

import java.util.Scanner;

public class Scannear {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        String nomeLanche;
        int precoLanche;
        double desconto = 5.0;

        System.out.println("Digite o nome do lanche: ");
        nomeLanche = sc.nextLine();
        System.out.println("Lanche adicionado: " + nomeLanche);

        System.out.println("Digite o preço do lanche: ");
        precoLanche = sc.nextInt();
        System.out.println("O preço do lanche é : " + "R$ " + precoLanche);

        if (precoLanche >= 30.0) {
            System.out.println("Você pode oferecer um cupom de desconto no valor de R$ " + desconto + ".");
            System.out.printf("O preço do lanche com o cupom aplicado fica: R$ %.2f.\n", precoLanche - desconto);
            System.out.println("Lanche e preço adicionados com sucesso");
        }

        else if (precoLanche <29.0) {
            System.out.println("Lanche e preço adicionados com sucesso.");
        }

        sc.close();
    }
}
