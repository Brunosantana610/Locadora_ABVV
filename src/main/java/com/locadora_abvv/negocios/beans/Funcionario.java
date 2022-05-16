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

    private static Funcao funcao;

    public Funcionario(String nome, String cpf, String senha, String telefone, String email, String endereco, LocalDate dataNascimento, double salario, int matricula, Funcao funcao) {
        super(nome, cpf, senha, telefone, email, endereco, dataNascimento);
        this.salario = salario;
        this.matricula = matricula;
        this.funcao = funcao;
    }

    public static int getFuncao() {
        return funcao.valor;
    }

    public void setFuncao(Funcao funcao) {
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
