package org.example.avaliacoes.restaurante.cardapio;

public class ComCheddar implements ItemCardapio {
    private ItemCardapio item;

    public ComCheddar(ItemCardapio itemEmbrulhado) {
        this.item = itemEmbrulhado;
    }

    @Override
    public String getDescricao () {return item.getDescricao() + " + cheddar";}

    @Override
    public String getNome() {return "";}

    @Override
    public double getPreco() {return item.getPreco() + 4.0;}
}
