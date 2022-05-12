package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Modelo;

public class ControladorModelo {

    private IRepositorio<Modelo> repositorioModelos;
    private static ControladorModelo instance;

    public ControladorModelo() {
        this.repositorioModelos = new Repositorio<>("modelos.dat");
    }

    public static ControladorModelo getInstance(){
        if (instance == null)
            instance = new ControladorModelo();
        return instance;
    }

    public void cadastrar(Modelo m) throws ElementoExisteException {
        this.repositorioModelos.cadastrar(m);
    }

    public void listar(){
        this.repositorioModelos.listar();
    }

    public void remover(Modelo m) throws ElementoNaoExisteExcepcion {
        this.repositorioModelos.remover(m);
    }

    public void atualizar(Modelo m) throws ElementoNaoExisteExcepcion {
        this.repositorioModelos.atualizar(m);
    }
}
