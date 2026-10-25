package org.example.listas_revisao.lista_revisao2;

class Consulta implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Levando " + nomePet + " para a consulta...");
    }
}
