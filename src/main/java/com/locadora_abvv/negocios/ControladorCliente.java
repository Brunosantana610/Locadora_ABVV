package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ClienteAlugadoException;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
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
    public void cadastrar(Cliente c) throws ElementoExisteException {
        boolean ok = true;
        for(Cliente cliente : this.repositorioClientes.listar()){
            if(cliente == c){
                ok = false;
            }
            break;
        }
        if(ok) {
            if(c.calcularIdade() >= 18 && c.getCnh() != null) {
                this.repositorioClientes.cadastrar(c);
            }
            else{
                throw new IllegalArgumentException("ERRO: Cliente não pode ter menos de 18 anos e/ou ter CNH nula");
            }
        }
        else{
            throw new ElementoExisteException(c);
        }


    }

    public void listar(){
        this.repositorioClientes.listar();
    }

    public void remover (Cliente c) throws ElementoNaoExisteExcepcion {
        boolean ok = false;
        for(Cliente cliente : this.repositorioClientes.listar()){
            if(cliente == c){
                ok = true;
            }
            break;
        }
        if(ok) {
            this.repositorioClientes.remover(c);
        }
        else{
            throw new ElementoNaoExisteExcepcion(c);
        }
    }

    public void atualizar (Cliente c) throws ElementoNaoExisteExcepcion {
        boolean ok = false;
        for(Cliente cliente : this.repositorioClientes.listar()){
            if(cliente == c){
                ok = true;
            }
            break;
        }
        if(ok) {
            this.repositorioClientes.atualizar(c);
        }
        else{
            throw new ElementoNaoExisteExcepcion(c);
        }
    }

}


