package org.example.exercicios.singleton;

public class testeSingleton {
    private static testeSingleton instancia;

    private testeSingleton(){

    }

    public static testeSingleton getInstancia() {
        if (instancia == null) {
            instancia = new testeSingleton();
        }
        return instancia;
    }

    testeSingleton testeS = testeSingleton.getInstancia();

}
