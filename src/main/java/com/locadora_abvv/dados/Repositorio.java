package com.locadora_abvv.dados;

import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.exceptions.ElementoNuloException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repositorio<T> implements IRepositorio<T>{

    protected List<T> elementos;
    private String nomeArquivo;


    public Repositorio(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.elementos = new ArrayList<>();

        Object listaElementos = RepoFiles.lerDoArquivo(this.nomeArquivo);
        if (listaElementos != null && listaElementos instanceof List<?>){
            this.elementos = (List<T>) listaElementos;
        }

    }

    @Override
    public void cadastrar(T obj) throws ElementoExisteException, ElementoNuloException {
        if (!this.elementos.contains(obj)) {
            this.elementos.add(obj);
        }
        else if(this.elementos.contains(obj) && obj != null) {
            throw new ElementoExisteException(obj);
        }
        else{
            throw new ElementoNuloException(obj);
        }

        RepoFiles.salvarArquivo(elementos, this.nomeArquivo);

    }

    @Override
    public List listar() {
        return Collections.unmodifiableList(this.elementos);
    }

    @Override
    public void remover(T obj) throws ElementoNaoExisteExcepcion {
        if (this.elementos.contains(obj)) {
            this.elementos.remove(this.elementos.indexOf(obj));
        } else {
            throw new ElementoNaoExisteExcepcion(obj);
        }

        RepoFiles.salvarArquivo(elementos, this.nomeArquivo);

    }

    @Override
    public void atualizar(T novoObj) throws ElementoNaoExisteExcepcion {
        if (this.elementos.contains(novoObj)) {
            int indice = this.elementos.indexOf(novoObj);
            this.elementos.set(indice, novoObj);
        } else {
            throw new ElementoNaoExisteExcepcion(novoObj);
        }

        RepoFiles.salvarArquivo(elementos, this.nomeArquivo);
    }

}

