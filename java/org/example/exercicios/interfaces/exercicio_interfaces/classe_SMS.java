package org.example.exercicios.interfaces.exercicio_interfaces;

public class classe_SMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
