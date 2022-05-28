package com.teste.di.notificacao;

import com.teste.di.modelo.Cliente;

public class NotificadorDeEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do email %s\n",
                cliente.getNome(), cliente.getEmail(),mensagem);
    }
}
