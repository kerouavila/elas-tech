package org.example.avaliacoes.restaurante.app;

import org.example.avaliacoes.restaurante.cardapio.ItemCardapio;
import org.example.avaliacoes.restaurante.cardapio.LancheFactory;
import org.example.avaliacoes.restaurante.pedido.Pedido;
import org.example.avaliacoes.restaurante.pedido.GerenciadorPedidos;

import java.util.ArrayList;
import java.util.HashSet;

public class RestauranteFacade {
    private GerenciadorPedidos gerenciador = new GerenciadorPedidos();

    public Pedido registrarPedido(String nomeCliente) {
        return gerenciador.criarPedido(nomeCliente);
    }

    public Pedido buscarPedido(int numero) {
        return gerenciador.buscarPedido(numero);
    }

    public ArrayList<Pedido> listarPedidos() {
        return gerenciador.getPedidos();
    }

    public double calcularTotalDoDia() {
        return gerenciador.calcularTotalDoDia();
    }

    public HashSet<String> obterCombinacoesDoDia() {
        HashSet<String> combinacoes = new HashSet<>();
        for (Pedido p : listarPedidos()) {
            for (ItemCardapio item : p.getItens()) {
                combinacoes.add(item.getDescricao());
            }
        }
        return combinacoes;
    }

    public ItemCardapio criarBauruPileque() { return LancheFactory.bauruPileque(); }
    public ItemCardapio criarBauruFrangoDaCasa() { return LancheFactory.bauruFrangoDaCasa(); }
    public ItemCardapio criarBauruStrogonoff() { return LancheFactory.bauruStrogonoff(); }
    public ItemCardapio criarBauruSuperComBacon() { return LancheFactory.bauruSuperComBacon(); }
    public ItemCardapio criarCocaZero() { return LancheFactory.cocaColaZeroLata(); }
    public ItemCardapio criarGuaranaFruki() { return LancheFactory.guaranaFrukiLata(); }
    public ItemCardapio criarBatataSimples() { return LancheFactory.batataCrinkleSimples(); }
    public ItemCardapio criarBatataCanoa() { return LancheFactory.batataCanoa(); }
}
