package org.example.exercicios.interfaces;

public class classe_SMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
