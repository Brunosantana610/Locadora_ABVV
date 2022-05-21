package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Fabricante;
import com.locadora_abvv.negocios.beans.Modelo;
import com.locadora_abvv.negocios.beans.Veiculo;
import java.util.List;

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

    public void cadastrar(Veiculo v) throws ElementoExisteException /*, ModeloInvalidoException*/ {
        List<Veiculo> veiculos = this.repositorioVeiculos.listar();
        if(veiculos.contains(v)){
            throw new ElementoExisteException(v);
        }
        else{
            LocalDate dataAtual = LocalDate.now();
            if(v != null && v.getModelo().getAno() < dataAtual.getYear() + 2){
                this.repositorioVeiculos.cadastrar(v);
            }
            else{
                //throw new ModeloInvalidoException();
            }
        }
    }


    public void listar(){
        this.repositorioVeiculos.listar();
    }

    public void remover(Veiculo v) throws ElementoNaoExisteExcepcion {
        List<Veiculo> veiculos = this.repositorioVeiculos.listar();
        if(veiculos.contains(v)){
            this.repositorioVeiculos.remover(v);
        }
        else{
            throw new ElementoNaoExisteExcepcion(v);
        }
    }

    public void atualizar(Veiculo v) throws ElementoNaoExisteExcepcion {
        List<Veiculo> veiculos = this.repositorioVeiculos.listar();
        if(veiculos.contains(v)){
            this.repositorioVeiculos.atualizar(v);
        }
        else{
            throw new ElementoNaoExisteExcepcion(v);
        }
    }
}
