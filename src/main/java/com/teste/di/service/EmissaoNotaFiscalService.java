package com.teste.di.service;

import com.teste.di.modelo.Cliente;
import com.teste.di.modelo.Produto;
import com.teste.di.notificacao.NotificadorSms;


public class EmissaoNotaFiscalService {

    public void emitir(Cliente cliente, Produto produto){
        //TODO simula a emissão do nf..

        NotificadorSms notificar = new NotificadorSms();
        notificar.notificar(cliente, "Nota fiscal do Produto"
        + produto.getNome() + " foi emitida! ");
    }

}
