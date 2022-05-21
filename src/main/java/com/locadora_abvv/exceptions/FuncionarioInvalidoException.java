package com.locadora_abvv.exceptions;

import com.locadora_abvv.negocios.beans.Funcionario;

import java.time.LocalDate;

public class FuncionarioInvalidoException extends Exception {
    private Funcionario funcionario;

    public FuncionarioInvalidoException(Funcionario funcionario){
        super("Funcionário inválido: Não foi possível adicionar o funcionário ao repositório");
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
