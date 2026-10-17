package org.example.listas_revisao.lista_revisão3;

public class revisao_abstracao {
    static void main() {

        //1 - resposta esta no READ me

        //2 - resposta esta no READ me

        //3
        Produto produto = new Produto();
        produto.setNome("Piranha roxa");
        produto.setPreco(99.90);
        produto.setQuantidade(100);

        System.out.println("Dados do produto:");
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: R$ " + produto.getPreco());
        System.out.println("Quandotidade em estoque: " + produto.getQuantidade());


        //4 - resposta esta no READ me

        //5
        Retangulo retangulo = new Retangulo("retânculo", 4.0, 5.0);
        retangulo.exibirNome();

        System.out.println("Área do retângulo: " + retangulo.calcularArea());

    }

}
