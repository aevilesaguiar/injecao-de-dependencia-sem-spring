package com.teste.di.service;

import com.teste.di.modelo.Cliente;

import com.teste.di.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;
//usando polimorfismo
    //eu só consigo usar Notificar se quem usar inserir o Notificador
    public AtivacaoClienteService(Notificador notificador){
        this.notificador=notificador;
    }

    //com essa classe conseguimos separar do Service
    public void  ativar (Cliente cliente){

        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    };
}
