package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Locacao;
import com.locadora_abvv.negocios.beans.Cliente;

public class ControladorLocacao {

    private IRepositorio<Locacao> repositorioLocacoes;
    private static ControladorLocacao instance;

    public ControladorLocacao() {
        this.repositorioLocacoes = new Repositorio<>("locacoes.dat");
    }

    public static ControladorLocacao getInstance(){
        if (instance == null)
            instance = new ControladorLocacao();
        return instance;
    }

    public void cadastrar(Locacao l) throws ElementoExisteException {

        boolean ok = true;
        for(Locacao loc : this.repositorioLocacoes.listar()){
            if(loc.getCliente() == l.getCliente()){
                if(loc.getAtivo() == true){
                    ok = false;
                }
                break;
            }
        }

        if(ok) {
            this.repositorioLocacoes.cadastrar(l);
        }
    }

    public void listar(){
        this.repositorioLocacoes.listar();
    }


    public void atualizar(Locacao l) throws ElementoNaoExisteExcepcion {
        this.repositorioLocacoes.atualizar(l);
    }
}
