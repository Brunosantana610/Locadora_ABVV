package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Veiculo;

import java.time.LocalDate;

public class ControladorVeiculo {

    private IRepositorio<Veiculo> repositorioVeiculos;

    private static ControladorVeiculo instance;

    public ControladorVeiculo() {
        this.repositorioVeiculos = new Repositorio<>("veiculos.dat");
    }

    public static ControladorVeiculo getInstance(){
        if (instance == null)
            instance = new ControladorVeiculo();
        return instance;
    }

    public void cadastrar(Veiculo v) throws ElementoExisteException {
        LocalDate dataAtual = LocalDate.now();
        if(v.getModelo().getAno() < dataAtual.getYear() + 2) {
            this.repositorioVeiculos.cadastrar(v);
        }
    }


    public void listar(){
        this.repositorioVeiculos.listar();
    }

    public void remover(Veiculo v) throws ElementoNaoExisteExcepcion {
        this.repositorioVeiculos.remover(v);
    }

    public void atualizar(Veiculo v) throws ElementoNaoExisteExcepcion {
        this.repositorioVeiculos.atualizar(v);
    }
}
