/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemapesca.beans;

import br.com.sistemapesca.controllers.GenericDao;
import br.com.sistemapesca.models.Pessoa;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author John
 */
@ManagedBean
@RequestScoped
public class PessoaService extends GenericDao<Object, Serializable>{
    Pessoa p = new Pessoa();
    
    public void salvar(){
    salvar(p);
       
    }

    public PessoaService() {
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
    
    
    
}
