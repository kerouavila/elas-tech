package org.example.avaliacoes.restaurante.app;

import org.example.avaliacoes.restaurante.cardapio.ItemCardapio;
import org.example.avaliacoes.restaurante.pedido.Pedido;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConsole {
    private Scanner sc = new Scanner(System.in);

    private int lerInteiroSeguro () {
        while (true) {

            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    public void exibirMenu(){
        System.out.println("\n--- Bem-vindo à lancheria gaúcha da Kerou ---");
        System.out.println("1 - Registrar novo pedido");
        System.out.println("2 - Listar pedidos do dia");
        System.out.println("3 - Modificar pedido existente");
        System.out.println("4 - Fechar restaurante");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return lerInteiroSeguro();
    }

    public String lerNomeCliente() {
        System.out.print("Digite o nome do cliente: ");
        return sc.nextLine();
    }

    public int escolherLanche() {
        System.out.println("\n--- Escolha o seu Xis ---");
        System.out.println("1 - Bauru Pileque - R$ 31,90");
        System.out.println("    (Alcatra picada ao vinho, queijo, alface, tomate e maionese)");
        System.out.println("2 - Bauru de frango da Casa - R$ 34,56");
        System.out.println("    (Frango em cubos com tempero da Casa frito na chapa, Catupiry, tomate, alface, queijo e maionese)");
        System.out.println("3 - Bauru Strogonoff - R$ 37,90");
        System.out.println("    (Bife picado, creme de leite, tomate, alface, palmito, queijo e maionese)");
        System.out.println("4 - Bauru Super com Bacon - R$ 47,80");
        System.out.println("    (Bife picado, bacon, coração, lombinho, tomate, alface, milho, queijo e maionese)");
        System.out.println("0 - Nenhum lanche");
        System.out.print("Escolha o número do lanche desejado: ");
        return lerInteiroSeguro();
    }

    public int escolherBebida() {
        System.out.println("\n--- Que tal adicionar uma bebida geladinha? ---");
        System.out.println("1 - Coca-cola zero lata - R$ 5,70");
        System.out.println("2 - Guaraná Fruki lata - R$ 5,70");
        System.out.println("0 - Não quero bebida");
        System.out.print("Escolha o número da bebida desejada: ");
        return lerInteiroSeguro();
    }

    public int escolherPorcao() {
        System.out.println("\n--- Quer adicionar uma porção? ---");
        System.out.println("1 - Batata crinkle simples - R$ 17,00");
        System.out.println("2 - Batata canoa - R$ 20,00");
        System.out.println("0 - Não quero porção");
        System.out.print("Escolha o número da porção desejada: ");
        return lerInteiroSeguro();
    }

    public int escolherAdicional () {
        System.out.println("\n--- Gostaria de incrementar o seu xis? ---");
        System.out.println("1 - Adicionar Cheddar (+ R$ 4,00)");
        System.out.println("2 - Adicionar Bacon Extra (+ R$ 6,00)");
        System.out.println("0 - Sem adicionais");
        System.out.print("Escolha uma opção de adicional: ");
        return lerInteiroSeguro();
    }

    public boolean perguntarRemoverQueijo() {
        System.out.print("Deseja retirar o queijo? (1 - Sim / 2 - Não): ");
        return lerInteiroSeguro() == 1;
    }

    public boolean perguntarRemoverAlface() {
        System.out.print("Deseja retirar o alface? (1 - Sim / 2 - Não): ");
        return lerInteiroSeguro() == 1;
    }

    public boolean perguntarRemoverTomate() {
        System.out.print("Deseja retirar o tomate? (1 - Sim / 2 - Não): ");
        return lerInteiroSeguro() == 1;
    }

    public boolean perguntarRemoverCebola() {
        System.out.print("Deseja retirar a cebola? (1 - Sim / 2 - Não): ");
        return lerInteiroSeguro() == 1;
    }

    public void exibirPedidoCriado(Pedido pedido) {
        System.out.println("\nPedido #" + pedido.getNumero() + " criado para " + pedido.getNomeCliente() + " com sucesso!");
    }

    public void listarPedidos(ArrayList<Pedido> pedidos) {
        System.out.println("\n--- Pedidos do dia ---");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado até o momento.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.println("Pedido #" + p.getNumero() + " - Cliente: " + p.getNomeCliente());
            for (ItemCardapio item : p.getItens()) {
                System.out.printf("   - %s (R$ %.2f)\n", item.getDescricao(), item.getPreco());
            }
            System.out.printf("   Total do pedido: R$ %.2f\n\n", p.calcularTotal());
        }
    }

    public int lerNumeroPedido() {
        System.out.print("Digite o número do pedido que deseja modificar: ");
        return lerInteiroSeguro();
    }

    public int escolherOpcaoModificacao() {
        System.out.println("\n--- Modificar Pedido ---");
        System.out.println("1 - Acrescentar novo item");
        System.out.println("2 - Remover item existente");
        System.out.println("3 - Cancelar pedido inteiro");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");
        return lerInteiroSeguro();
    }

    public int escolherItemParaRemover(Pedido pedido) {
        System.out.println("\n--- Itens do Pedido #" + pedido.getNumero() + " ---");
        ArrayList<ItemCardapio> itens = pedido.getItens();
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + " - " + itens.get(i).getDescricao() + " (R$ " + itens.get(i).getPreco() + ")");
        }
        System.out.print("Digite o número do item que deseja remover: ");
        return lerInteiroSeguro();
    }

    public void exibirFechamentoDoDia(double total) {
        System.out.println("\n--- Total do dia ---");
        System.out.printf("Total vendido no dia: R$ %.2f\n", total);
    }
}