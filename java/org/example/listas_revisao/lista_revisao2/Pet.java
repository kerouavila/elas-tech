package org.example.listas_revisao.lista_revisao2;

public class Pet {

    String nome;
    String especie;
    String cor;
    public String porte;
    double peso;

    public Pet(String nomeDigitado, String especieDigitado, String corDigitado, double pesoDigitado) {

        nome = nomeDigitado;
        especie = especieDigitado;
        cor = corDigitado;
        peso = pesoDigitado;

    }

    public String definirPorte() {

        if (peso < 3.5) {
            return "Pequeno";
        } else if (peso < 5) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void exibirFicha(){
        System.out.println("◃*───────────*▹ Ficha do Pet ◃*───────────*▹");
        System.out.println("Nome do pet: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso + "kg.");
        System.out.println("Porte: " + porte);
    }
}
