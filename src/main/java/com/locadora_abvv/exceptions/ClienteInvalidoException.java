package com.locadora_abvv.exceptions;

import com.locadora_abvv.negocios.beans.Cliente;

public class ClienteInvalidoException extends Exception{

    private Cliente cliente;

    public ClienteInvalidoException(Cliente cliente){
        super("Cliente inválido: Não foi possível adicionar o cliente ao repositório");
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
