package org.example.avaliacoes.restaurante.pedido;

import org.example.avaliacoes.restaurante.cardapio.ItemCardapio;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private String nomeCliente;

    private ArrayList<ItemCardapio> itens = new ArrayList<>();

    public Pedido(int numero, String nomeCliente) {
        this.numero = numero;
        setNomeCliente(nomeCliente);
    }

    public int getNumero() {return numero;}

    public String getNomeCliente() {return nomeCliente;}

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("Por favor, insira um nome válido para o cliente. O campo não pode ser vazio.");
        }
        if (!nomeCliente.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
            throw new IllegalArgumentException("Por favor, insira um nome para o cliente que contenha apenas letras.");
        }
        this.nomeCliente = nomeCliente;
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public ArrayList<ItemCardapio> getItens() {
        return itens;
    }

    public void exibirDetalhesPedido() {
        System.out.println("Pedido #" + numero + " - Cliente: " + nomeCliente);
        for (ItemCardapio item : itens) {
            System.out.printf(" - %s: R$ %.2f\n", item.getDescricao(), item.getPreco());
        }
        System.out.printf("Total: R$ %.2f\n", calcularTotal());
    }

    public void removerItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            itens.remove(indice);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCardapio item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
