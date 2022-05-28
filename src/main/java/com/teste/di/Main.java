package com.teste.di;

import com.teste.di.modelo.Cliente;
import com.teste.di.notificacao.Notificador;
import com.teste.di.notificacao.NotificadorDeEmail;
import com.teste.di.service.AtivacaoClienteService;
import com.teste.di.service.EmissaoNotaFiscalService;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Joao Pedro");
        cliente1.setEmail("joao@gmail.com");
        cliente1.setTelefone("11 5656-8989");

        Cliente cliente2= new Cliente("Maria Silva", "maria@gmail.com","(11)2323-8989");


        System.out.println("/****************Ativando Clientes**************/");

        //injetando notificador
        Notificador notificador = new NotificadorDeEmail();
        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(cliente1);
        ativacaoCliente.ativar(cliente2);





    }
}
