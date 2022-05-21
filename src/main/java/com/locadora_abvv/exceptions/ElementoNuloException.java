package com.locadora_abvv.exceptions;

public class ElementoNuloException extends Exception{

    private Object elemento;

    public ElementoNuloException(Object obj) {
        super("Elemento nulo: elemento fornecido não pode ser nulo");
        this.elemento = obj;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
