import org.example.avaliacoes.restaurante.app.MenuConsole;
import org.example.avaliacoes.restaurante.app.RestauranteFacade;
import org.example.avaliacoes.restaurante.cardapio.ComBaconExtra;
import org.example.avaliacoes.restaurante.cardapio.ComCheddar;
import org.example.avaliacoes.restaurante.cardapio.ItemCardapio;
import org.example.avaliacoes.restaurante.cardapio.Lanche;
import org.example.avaliacoes.restaurante.pedido.Pedido;

import java.util.HashSet;

public static void main() {
    RestauranteFacade sistema = new RestauranteFacade();
    MenuConsole menu = new MenuConsole();
    int opcao;

    do {
        menu.exibirMenu();
        opcao = menu.lerOpcao();

        switch (opcao) {
            case 1:
                Pedido pedido = null;
                do {
                    try {
                        String nomeCliente = menu.lerNomeCliente();
                        pedido = sistema.registrarPedido(nomeCliente);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                } while (pedido == null);

                int escolhaLanche;
                ItemCardapio itemPedido = null;

                do {
                    escolhaLanche = menu.escolherLanche();

                    if (escolhaLanche == 1) {
                        itemPedido = sistema.criarBauruPileque();

                    } else if (escolhaLanche == 2) {
                        itemPedido = sistema.criarBauruFrangoDaCasa();

                    } else if (escolhaLanche == 3) {
                        itemPedido = sistema.criarBauruStrogonoff();

                    } else if (escolhaLanche == 4) {
                        itemPedido = sistema.criarBauruSuperComBacon();

                    } else if (escolhaLanche == 0) {
                        break;

                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção de 0 a 4.");
                    }

                } while (itemPedido == null && escolhaLanche != 0);

                if (itemPedido != null && itemPedido instanceof Lanche) {
                    Lanche lanche = (Lanche) itemPedido;

                    if (menu.perguntarRemoverQueijo()) lanche.setQueijo(false);
                    if (menu.perguntarRemoverAlface()) lanche.setAlface(false);
                    if (menu.perguntarRemoverTomate()) lanche.setTomate(false);
                    if (menu.perguntarRemoverCebola()) lanche.setCebola(false);

                    itemPedido = lanche;
                }

                if (itemPedido != null) {
                    int escolhaAdicional;
                    boolean adicionalValido = false;

                    do {
                        escolhaAdicional = menu.escolherAdicional();

                        if (escolhaAdicional == 1) {
                            itemPedido = new ComCheddar(itemPedido);
                            adicionalValido = true;

                        } else if (escolhaAdicional == 2) {
                            itemPedido = new ComBaconExtra(itemPedido);
                            adicionalValido = true;

                        } else if (escolhaAdicional == 0) {
                            adicionalValido = true;

                        } else {
                            System.out.println("Opção inválida. Por favor, escolha uma opção de 0 a 2.");
                        }

                    } while (!adicionalValido);

                    pedido.adicionarItem(itemPedido);
                }

                int escolhaBebida;
                ItemCardapio bebida = null;

                do {
                    escolhaBebida = menu.escolherBebida();

                    if (escolhaBebida == 1) {
                        bebida = sistema.criarCocaZero();

                    } else if (escolhaBebida == 2) {
                        bebida = sistema.criarGuaranaFruki();

                    } else if (escolhaBebida == 0) {
                        break;

                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção de 0 a 2.");
                    }
                } while (bebida == null && escolhaBebida != 0);

                if (bebida != null) {
                    pedido.adicionarItem(bebida);
                }

                int escolhaPorcao;
                ItemCardapio porcao = null;
                do {
                    escolhaPorcao = menu.escolherPorcao();

                    if (escolhaPorcao == 1) {
                        porcao = sistema.criarBatataSimples();

                    } else if (escolhaPorcao == 2) {
                        porcao = sistema.criarBatataCanoa();

                    } else if (escolhaPorcao == 0) {
                        break;

                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção de 0 a 2.");

                    }

                } while (porcao == null && escolhaPorcao != 0);

                if (porcao != null) {
                    pedido.adicionarItem(porcao);
                }

                if (pedido.getItens().isEmpty()) {
                    System.out.println("Seu pedido foi cancelado, pois nenhum item foi selecionado.");

                } else {
                    menu.exibirPedidoCriado(pedido);
                }
                break;

            case 2:
                menu.listarPedidos(sistema.listarPedidos());
                break;

            case 3:
                int numPedido = menu.lerNumeroPedido();
                Pedido pedidoEncontrado = sistema.buscarPedido(numPedido);

                if (pedidoEncontrado == null) {
                    System.out.println("O pedido #" + numPedido + " não foi encontrado.");
                    break;
                }

                int opcaoMod;
                do {
                    opcaoMod = menu.escolherOpcaoModificacao();

                    if (opcaoMod == 1) {
                        System.out.println("Selecione o tipo de item.");

                    } else if (opcaoMod == 2) {
                        int itemEscolhido = menu.escolherItemParaRemover(pedidoEncontrado);
                        if (itemEscolhido > 0) {
                            pedidoEncontrado.removerItem(itemEscolhido - 1);
                            System.out.println("O item foi removido com sucesso. Total atualizado: R$ " + pedidoEncontrado.calcularTotal());
                        }

                    } else if (opcaoMod == 3) {
                        sistema.listarPedidos().remove(pedidoEncontrado);
                        System.out.println("O pedido #" + numPedido + " foi cancelado e removido com sucesso.");
                        break;

                    } else if (opcaoMod == 0) {
                        System.out.println("Saindo da modificação de pedidos.");

                    } else {
                        System.out.println("Opção inválida.");
                    }
                } while (opcaoMod != 0);
                break;

            case 4:
                double totalDia = sistema.calcularTotalDoDia();
                menu.exibirFechamentoDoDia(totalDia);

                HashSet<String> combinacoes = sistema.obterCombinacoesDoDia();
                System.out.println("Total de combinações diferentes solicitadas: " + combinacoes.size());
                System.out.println("Combinações realizadas no dia:");
                for (String desc : combinacoes) {
                    System.out.println(" - " + desc);
                }
                break;

            case 0:
                System.out.println("Fechando a lancheria...");
                break;

            default:
                System.out.println("Opção inválida. Por favor, insira um número de 0 a 4.");
        }
    } while (opcao != 0);
}