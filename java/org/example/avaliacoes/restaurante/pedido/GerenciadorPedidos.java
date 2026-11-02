package org.example.avaliacoes.restaurante.pedido;

import java.util.HashMap;
import java.util.ArrayList;

public class GerenciadorPedidos{
    private HashMap<Integer, Pedido> pedidos = new HashMap<>();
    private int contadorPedidos = 1;

    public Pedido criarPedido (String nomeCliente) {
        Pedido novo = new Pedido(contadorPedidos, nomeCliente);
        pedidos.put(novo.getNumero(), novo);
        contadorPedidos++;
        return novo;
    }

    public Pedido buscarPedido (int numero) {
        return pedidos.get(numero);
    }

    public ArrayList<Pedido> getPedidos () {
        return new ArrayList<>(pedidos.values());
    }

    public double calcularTotalDoDia() {
        double totalDia = 0;
        for (Pedido p : pedidos.values()){
            totalDia += p.calcularTotal();
        }
        return totalDia;
    }
}