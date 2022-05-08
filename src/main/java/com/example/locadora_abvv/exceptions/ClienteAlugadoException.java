package com.example.locadora_abvv.exceptions;

public class ClienteAlugadoException extends Exception{

    private static final long serialVersionUID = -7096022758377417172L;

    private Object elemento;

    public ClienteAlugadoException(Object obj) {
        super("Este cliente já tem uma locação em andamento");
        this.elemento = obj;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
