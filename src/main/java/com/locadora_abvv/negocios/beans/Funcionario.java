package com.locadora_abvv.negocios.beans;

import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private double salario;
    private int matricula;
    enum Funcao {
        ATENDENTE(1), ADMINISTRADOR(2);

        private int valor;
        Funcao (int valor){
            this.valor=valor;
        }
    }

    private static int funcao;

    public Funcionario(String nome, String cpf, String senha, String telefone, String email, String endereco, LocalDate dataNascimento, double salario, int matricula, int funcao) {
        super(nome, cpf, senha, telefone, email, endereco, dataNascimento);
        this.salario = salario;
        this.matricula = matricula;
        this.funcao = funcao;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
