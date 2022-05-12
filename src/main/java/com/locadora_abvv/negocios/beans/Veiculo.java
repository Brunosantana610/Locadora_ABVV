package com.locadora_abvv.negocios.beans;

public class Veiculo {
    private String cor;
    private int capacidade;
    private String descricao;
    private String placa;

    private double valorMulta;

    private Modelo modelo;

    private Fabricante fabricante;

    public Veiculo(String cor, int capacidade, String descricao, String placa, double valorMulta, Modelo modelo, Fabricante fabricante) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.placa = placa;
        this.valorMulta = valorMulta;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


}