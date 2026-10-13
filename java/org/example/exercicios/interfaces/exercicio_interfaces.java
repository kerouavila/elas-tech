package org.example.exercicios.interfaces;

import java.util.ArrayList;

public class exercicio_interfaces {
    static void main() {

        //1
        Animal cachorro = new classe_cachorro();
        cachorro.emitirSom();

        //2
        Animal gato = new classe_gato();
        gato.emitirSom();

        //3
        ArrayList<Animal> animaix = new ArrayList<>();
        animaix.add(new classe_cachorro());
        animaix.add(new classe_gato());

        for (Animal animai : animaix){
            animai.emitirSom();
        }

        //4
        ArrayList<Notificacao> alertas = new ArrayList<>();
        alertas.add(new classe_email());
        alertas.add(new classe_SMS());

        for (Notificacao alerta : alertas){
            alerta.enviar("sua compra foi aprovada!");
        }

        //5
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new classe_carro());
        listaVeiculos.add(new classe_moto());

        for (Veiculo veiculos : listaVeiculos) {
            veiculos.ligar();
            veiculos.acelerar();
        }
    }
}
