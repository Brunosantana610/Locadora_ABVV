package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.*;
import com.locadora_abvv.negocios.beans.Cliente;
import com.locadora_abvv.negocios.beans.Fabricante;
import com.locadora_abvv.negocios.beans.Locacao;


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
    public void cadastrar(Cliente c) throws ElementoExisteException, ClienteInvalidoException, ElementoNuloException {

        if(c != null && c.calcularIdade() >= 18 && c.getCnh() != null) {
               this.repositorioClientes.cadastrar(c);
        }
        else{
            throw new ClienteInvalidoException(c);
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


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Cliente buscar(String cpf){
        for(Cliente cli: repositorioClientes.listar()){
            if(this.cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

}


