# Projeto 1 - Sistema de Restaurante

Sistema desenvolvido em Java para o gerenciamento de pedidos de uma lanchonete, aplicando conceitos sólidos de Orientação a Objetos, padrões de projeto e boas práticas de arquitetura de software.

📽️Vídeo de apresentação: https://drive.google.com/file/d/1usYzwonZY4z7c8Cx1PZbO25Sbi9l_Kcl/view?usp=sharing

## O que o sistema deve fazer:
### 1. Permitir que o usuário:
- Crie novos pedidos de lanches;
- Visualize e edite pedidos existentes;
- Feche o caixa com o valor total de todos os pedidos (fechar o restaurante);
- Abandone o sistema sem fazer nenhuma ação.

### 2. Cadastro de pedidos com nome, descrição e preço:
- O sistema deve exibir um cardápio fixo e o usuário apenas seleciona os lanches e os customiza, removendo ou adicionando novos itens.
- O cardápio deve exibir os preços dos itens;

### 3. Soma de preços:
- Cada remoção ou adição de novos itens deve impactar o preço final dos pedidos;
- Ao final do dia, o caixa deve mostrar o valor total faturado com a soma de todos os lanches cadastrados.

### 4. Tratamento de erros:
- A experiência do usuário deve ser fluida e o sistema deve reagir quando os dados forem preenchidos incorretamente, apontando o que foi feito de errado e instruindo o usuário a como corrigir.

## Organização do projeto
O projeto foi estruturado em camadas. Criei uma nova pasta para o projeto do restaurante. Dentro dela, organizei três pastas para inserir os arqivos essenciais do sistema, sendo eles:

### 📂 App
Possui os arquivos:
- 📄Main;
- 📄MenuConsole: interage com o usuário, solicita, lê e valida os detalhes dos pedidos criados;
- 📄RestauranteFacade: centraliza o acesso às regras de negócio e simplifica a comunicação entre a interface e o gerenciador de pedidos.

### 📂 Cardapio
Possui os arquivos:
- 📄ItemCardapio: é o contrato base para todos os itens que podem fazer parte do cardápio da lancheria;
- 📄Lanche: armazena os dados dos lanches e fornece os métodos para que o sistema possa consultar;
- 📄LancheFactory: centraliza e padroniza a criação dos objetos do cardápio;
- 📄ComBaconExtra: permite adicionar os ingredientes extras (Decorator);
- 📄ComCheddar: permite adicionar os ingredientes extras (Decorator).

### 📂 Pedido
Possui os arquivos:
- 📄GerenciadorPedidos: controla todos os pedidos do restaurante;
- 📄Pedido: controla os dados de um pedido individual.

## Testes e tratamento de erros
Ao longo da construção, testei a lógica dos menus e tentei identificar cenários de falha, como:
- O usuário tentar colocar números no lugar de um nome;
- O usuário escolher opções inexistentes;
- O usuário tentar criar pedidos de lanche com valores zerados.

Tratei cada cenário com Try Catch. Veja todos eles em:

## Conclusão
De modo geral, este projeto me instruiu a programar um sistema orientado a objetos, utilizando classes, encapsulamento e interfaces para modelar o código e garantir a separação de responsabilidades.
