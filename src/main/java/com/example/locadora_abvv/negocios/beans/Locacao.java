package com.example.locadora_abvv.negocios.beans;

import java.time.LocalDateTime;

public class Locacao {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private LocalDateTime dataEntrega;
    private double valorDiaria;

    public Locacao(LocalDateTime dataInicio, LocalDateTime dataFim, LocalDateTime dataEntrega, double valorDiaria) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataEntrega = dataEntrega;
        this.valorDiaria = valorDiaria;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
