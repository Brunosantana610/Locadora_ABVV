package com.locadora_abvv.negocios;

import com.locadora_abvv.dados.IRepositorio;
import com.locadora_abvv.dados.Repositorio;
import com.locadora_abvv.exceptions.ElementoExisteException;
import com.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.locadora_abvv.negocios.beans.Fabricante;
import com.locadora_abvv.negocios.beans.Locacao;
import com.locadora_abvv.negocios.beans.Cliente;
import java.util.List;

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

    public void cadastrar(Locacao l) throws ElementoExisteException /*, ClienteInvalidoException*/{
        List<Locacao> locacoes = this.repositorioLocacoes.listar();
        if(locacoes.contains(l)){
            throw new ElementoExisteException(l);
        }
        else{
            for(Locacao locacao : locacoes){
                if(locacao.getCliente().equals(l.getCliente()) && l.getAtivo()){
                    //throw new ClienteInvalidoException();
                }
                else{
                    this.repositorioLocacoes.cadastrar(l);
                }
            }
        }

    }

    public void listar(){
        this.repositorioLocacoes.listar();
    }


    public void atualizar(Locacao l) throws ElementoNaoExisteExcepcion {
        List<Locacao> locacoes = this.repositorioLocacoes.listar();
        if(locacoes.contains(l)){
            this.repositorioLocacoes.atualizar(l);
        }
        else{
            throw new ElementoNaoExisteExcepcion(l);
        }
    }

    public void finalizarLocacao(Locacao l){
        l.calcularValorTotal(l.getVeiculo());
        l.setAtivo(false);
    }
}
