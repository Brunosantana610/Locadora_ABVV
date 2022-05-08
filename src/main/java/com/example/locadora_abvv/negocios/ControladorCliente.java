package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ClienteAlugadoException;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Cliente;
import com.example.locadora_abvv.negocios.beans.Locacao;

public class ControladorCliente {
    private IRepositorio<Cliente> repositorioClientes;

    private static ControladorCliente instance;

    private Cliente cliente;
    private Locacao locacao;

    public ControladorCliente() {
        this.repositorioClientes = new Repositorio<>("clientes.dat");
    }

    public static ControladorCliente getInstance(){
        if (instance == null){
            instance = new ControladorCliente();
        }
        return instance;
    }
    public void cadastrar(Cliente c) throws ElementoExisteException {
        if(c.calcularIdade() >= 18 && c.getCnh() != null) {
            this.repositorioClientes.cadastrar(c);
        }
    }

    public void listar(){
        this.repositorioClientes.listar();
    }

    public void remover (Cliente c) throws ElementoNaoExisteExcepcion {
        this.repositorioClientes.remover(c);
    }

    public void atualizar (Cliente c) throws ElementoNaoExisteExcepcion {
        this.repositorioClientes.atualizar(c);
    }

    public void devolver (Cliente c) {
        c.setLocacao(null);
    }

    public void alugar(Locacao l) throws ClienteAlugadoException, ElementoNaoExisteExcepcion{
        if (this.cliente.getLocacao() == null){
            this.cliente.setLocacao(l);
        }
    }
}


