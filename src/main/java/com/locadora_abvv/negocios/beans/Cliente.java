package com.locadora_abvv.negocios.beans;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private String formaPagamento;
    private String cnh;
    private Locacao locacao;

    public Cliente(String nome, String cpf, String senha, String telefone, String email, String endereco, LocalDate dataNascimento, String formaPagamento, String cnh) {
        super(nome, cpf, senha, telefone, email, endereco, dataNascimento);
        this.formaPagamento = formaPagamento;
        this.cnh = cnh;
        locacao = null;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

}
