package com.teste.di.notificacao;

import com.teste.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente,String mensagem );
}
