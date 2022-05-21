package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Cliente;
import com.locadora_abvv.negocios.beans.Fabricante;
import com.locadora_abvv.negocios.beans.Funcionario;
import java.util.List;

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

    public void cadastrar(Funcionario f) throws ElementoExisteException /* , FuncionarioInvalidoException, FuncaoInvalidaException */ {
        if (f.getFuncao()==2){
            List<Funcionario> funcionarios = this.repositorioFuncionarios.listar();

            if(funcionarios.contains(f)){
                throw new ElementoExisteException(f);
            }
            else{
                if (f != null && f.calcularIdade() >= 18) {
                    this.repositorioFuncionarios.cadastrar(f);
                }
                else{
                    //throw new FuncionarioInvalidoException();
                }
            }
        }
        else{
            // throw new FuncaoInvalidaException();
        }
    }

    public void listar(){
        this.repositorioFuncionarios.listar();
    }

    public void remover(Funcionario f) throws ElementoNaoExisteExcepcion /* , FuncaoInvalidaException */ {
        if (f.getFuncao()==2) {
            List<Funcionario> funcionarios = this.repositorioFuncionarios.listar();
            if(funcionarios.contains(f)){
                this.repositorioFuncionarios.remover(f);
            }
            else{
                throw new ElementoNaoExisteExcepcion(f);
            }
        }
        else{
            // throw new FuncaoInvalidaException();
        }
    }

    public void atualizar(Funcionario f) throws ElementoNaoExisteExcepcion /* , FuncaoInvalidaException */ {
        if (f.getFuncao()==2) {
            List<Funcionario> funcionarios = this.repositorioFuncionarios.listar();
            if(funcionarios.contains(f)){
                this.repositorioFuncionarios.atualizar(f);
            }
            else{
                throw new ElementoNaoExisteExcepcion(f);
            }
        }
        else{
            // throw new FuncaoInvalidaException();
        }
    }

    public Funcionario buscar(String cpf){
        for(Funcionario fun: repositorioFuncionarios.listar()){
            if(this.funcionario.getCpf().equals(cpf)){
                return funcionario;
            }
        }
        return null;
    }
}
