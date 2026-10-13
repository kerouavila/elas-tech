package org.example.exercicios.interfaces;

public class classe_email implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
