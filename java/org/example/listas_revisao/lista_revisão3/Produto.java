package org.example.listas_revisao.lista_revisão3;

 class Produto {

     private String nome;
     private double preco;
     private int quantidade;

     public String getNome() {
         return nome;
     }

     public double getPreco() {
         return preco;
     }

     public int getQuantidade() {
         return quantidade;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public void setPreco(double preco) {
         if (preco > 0) {
             this.preco = preco;
         } else {
             System.out.println("O preço deve ser maior que 0");
         }
     }

     public void setQuantidade(int quantidade) {
         if (quantidade >= 0) {
             this.quantidade = quantidade;
         } else {
             System.out.println("A quantidade não aceita valores negativos.");
         }
     }

}
