package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Funcionario;

public class ControladorFuncionario {

    private IRepositorio<Funcionario> repositorioFuncionarios;
    private static ControladorFuncionario instance;

    public ControladorFuncionario() {
        this.repositorioFuncionarios = new Repositorio<>("funcionarios.dat");
    }

    public static ControladorFuncionario getInstance(){
        if (instance == null)
            instance = new ControladorFuncionario();
        return instance;
    }

    public void cadastrar(Funcionario f) throws ElementoExisteException {
        if (f.getFuncao()==2) {
            if (f.calcularIdade() >= 18) {
                this.repositorioFuncionarios.cadastrar(f);
            } else {
                throw new IllegalArgumentException("ERRO: Funcionário não pode ter menos de 18 anos");
            }
        }
    }

    public void listar(){
        this.repositorioFuncionarios.listar();
    }

    public void remover(Funcionario f) throws ElementoNaoExisteExcepcion {
        if (f.getFuncao()==2)
            this.repositorioFuncionarios.remover(f);
    }

    public void atualizar(Funcionario f) throws ElementoNaoExisteExcepcion {
        if (f.getFuncao()==2)
            this.repositorioFuncionarios.atualizar(f);
    }
}
