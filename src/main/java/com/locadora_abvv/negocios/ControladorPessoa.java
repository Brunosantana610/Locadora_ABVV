package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Pessoa;

public class ControladorPessoa {

    private IRepositorio<Pessoa> repositorioPessoas;

    private static ControladorPessoa instance;

    public ControladorPessoa() {
        this.repositorioPessoas = new Repositorio<>("pessoas.dat");
    }

    public static ControladorPessoa getInstance(){
        if (instance == null)
            instance = new ControladorPessoa();
        return instance;
    }

    public void cadastrar(Pessoa p) throws ElementoExisteException {
        this.repositorioPessoas.cadastrar(p);
    }

    public void listar(){
        this.repositorioPessoas.listar();
    }

    public void remover(Pessoa p) throws ElementoNaoExisteExcepcion {
        this.repositorioPessoas.remover(p);
    }

    public void atualizar(Pessoa p) throws ElementoNaoExisteExcepcion {
        this.repositorioPessoas.atualizar(p);
    }
}
