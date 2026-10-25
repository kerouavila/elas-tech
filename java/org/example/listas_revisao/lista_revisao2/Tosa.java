package org.example.listas_revisao.lista_revisao2;

class Tosa implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Tosando " + nomePet + "...");
    }
}
