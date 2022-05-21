package com.locadora_abvv.exceptions;

import com.locadora_abvv.negocios.beans.Modelo;

public class ModeloInvalidoException extends Exception{

    private Modelo modelo;

    public ModeloInvalidoException(Modelo modelo){
        super("Modelo Inválido: o modelo fornecido possui um ano inválido");
        this.modelo = modelo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
