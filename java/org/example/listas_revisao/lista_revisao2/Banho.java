package org.example.listas_revisao.lista_revisao2;

class Banho implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }
}
