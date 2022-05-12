package com.locadora_abvv.negocios.beans;

public class Modelo {
    private String nomeModelo;
    private int ano;

    public Modelo(String nomeModelo, int ano) {
        this.nomeModelo = nomeModelo;
        this.ano = ano;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
