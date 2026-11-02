package org.example.avaliacoes.restaurante.cardapio;

public class Lanche implements ItemCardapio {
    private String nome;
    private double preco;
    private boolean queijo = true;
    private boolean alface = true;
    private boolean tomate = true;
    private boolean cebola = true;

    public Lanche(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Por favor, insira um preço válido para o lanche, o valor não pode ser negativo.");
        }

        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {return nome;}

    @Override
    public double getPreco() {return preco;}

    @Override
    public String getDescricao() {String desc = nome;

        if (!queijo) desc += " sem queijo";
        if (!alface) desc += " sem alface";
        if (!tomate) desc += " sem tomate";
        if (!cebola) desc += " sem cebola";
        return desc;
    }

    public void setQueijo(boolean queijo) {this.queijo = queijo;}
    public void setAlface(boolean alface) {this.alface = alface;}
    public void setTomate(boolean tomate) {this.tomate = tomate;}
    public void setCebola(boolean cebola) {this.cebola = cebola;}
}
