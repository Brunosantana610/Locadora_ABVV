package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.exceptions.ElementoNuloException;
import com.locadora_abvv.exceptions.FuncionarioInvalidoException;
import com.locadora_abvv.negocios.beans.Funcionario;

public class ControladorFuncionario {

    private IRepositorio<Funcionario> repositorioFuncionarios;
    private static ControladorFuncionario instance;

    Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ControladorFuncionario() {
        this.repositorioFuncionarios = new Repositorio<>("funcionarios.dat");
    }

    public static ControladorFuncionario getInstance(){
        if (instance == null)
            instance = new ControladorFuncionario();
        return instance;
    }

    public void cadastrar(Funcionario f) throws ElementoExisteException, FuncionarioInvalidoException, ElementoNuloException{
        if (f.getFuncao()==2){

            if (f != null && f.calcularIdade() >= 18) {
                this.repositorioFuncionarios.cadastrar(f);
            }
            else{
                throw new FuncionarioInvalidoException(f);
            }

        }
        else{
            throw new FuncionarioInvalidoException(f);
        }
    }

    public void listar(){
        this.repositorioFuncionarios.listar();
    }

    public void remover(Funcionario f) throws ElementoNaoExisteExcepcion, FuncionarioInvalidoException{
        if (f.getFuncao()==2) {
            this.repositorioFuncionarios.remover(f);
        }
        else{
            throw new FuncionarioInvalidoException(f);
        }
    }

    public void atualizar(Funcionario f) throws ElementoNaoExisteExcepcion, FuncionarioInvalidoException{
        if (f.getFuncao()==2) {
            this.repositorioFuncionarios.atualizar(f);
        }
        else{
            throw new FuncionarioInvalidoException(f);
        }
    }

    public Funcionario buscar(String cpf){
        for(Funcionario fun: repositorioFuncionarios.listar()){
            if(fun.getCpf().equals(cpf)){
                return fun;
            }
        }
        return null;
    }
}
