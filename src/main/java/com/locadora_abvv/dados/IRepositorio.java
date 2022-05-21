package com.locadora_abvv.dados;

import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.exceptions.ElementoNuloException;

import java.util.List;

public interface IRepositorio<T> {
    void cadastrar(T obj) throws ElementoExisteException, ElementoNuloException;
    List<T> listar();
    void remover(T obj) throws ElementoNaoExisteExcepcion;
    void atualizar(T novoObj) throws ElementoNaoExisteExcepcion;

}
