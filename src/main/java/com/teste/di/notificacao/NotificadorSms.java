package com.teste.di.notificacao;

import com.teste.di.modelo.Cliente;

public class NotificadorSms implements Notificador {


    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificador %s por SMS através do telefone %s: %s\n ", cliente.getNome() , cliente.getTelefone(),mensagem);
    }
}
