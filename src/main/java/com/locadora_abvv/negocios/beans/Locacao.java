package com.locadora_abvv.negocios.beans;

import java.time.LocalDate;
import java.time.Period;

public class Locacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalDate dataEntrega;
    private double valorDiaria;
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean ativo;

    public Locacao(LocalDate dataInicio, LocalDate dataFim, LocalDate dataEntrega, double valorDiaria, Cliente cliente, Veiculo veiculo, boolean ativo) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataEntrega = dataEntrega;
        this.valorDiaria = valorDiaria;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.ativo = true;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcularValorTotal(double valor, int dias, int diasExcedentes, int diasUtilizados, double ValorMulta){
        Period periodo = Period.between(dataInicio, dataFim);
        Period periodoUtilizado = Period.between(dataInicio, dataEntrega);
        dias = periodo.getDays();
        diasUtilizados = periodoUtilizado.getDays();
        diasExcedentes = periodoUtilizado.getDays() - dias;
        double valorMultaTotal = diasExcedentes * ValorMulta;
        valor = (valorDiaria * diasUtilizados) + valorMultaTotal;
        return valor;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
