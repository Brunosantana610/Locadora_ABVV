package com.locadora_abvv.exceptions;


import com.locadora_abvv.negocios.beans.Locacao;

public class LocacaoInvalidoException extends Exception{
    private Locacao locacao;

    public LocacaoInvalidoException(Locacao locacao){
        super("Locação inválida: Não foi possível adicionar a locação ao repositório");
        this.locacao = locacao;
    }


    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }


}
