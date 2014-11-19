package br.com.sistemapesca.beans;

import br.com.sistemapesca.controllers.GenericDao;
import br.com.sistemapesca.models.Apontador;
import br.com.sistemapesca.util.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author John
 */
@ManagedBean
@SessionScoped
public class ApontadorService extends GenericDao<Apontador, Serializable> {

    private Apontador apontador = new Apontador();
    private List<Apontador> apontadores = new ArrayList<>();
    private Session sessao;
    private Transaction trans;
    private String nome = "";

    public Apontador getApontador() {
        return apontador;
    }

    public void setApontador(Apontador apontador) {
        this.apontador = apontador;
    }

    public List<Apontador> getApontadores() {
        return apontadores;
    }

    public void setApontadores(List<Apontador> apontadores) {
        this.apontadores = apontadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void salvarApontador() {
        apontador.getPessoa().setDataCadastro(new Date());
        salvar(apontador);
        apontador = new Apontador();
        listarApontadores();

    }

    public void deletar() {
        excluir(apontador);
        apontador = new Apontador();
    }

    public List listarApontadores() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        apontadores = sessao.createCriteria(Apontador.class).list();
        System.out.println("quantidade de apontadores no banco " + apontadores.size());
        sessao.clear();
        return apontadores;
    }

    public List BuscarApontadores() {
        if (nome == null) {
            listarApontadores();
            return null;
        }
        sessao = HibernateUtil.getSessionFactory().openSession();
        apontadores = sessao.createCriteria(Apontador.class).createCriteria("pessoa").add(Restrictions.eq("nome", nome)).list();
        System.out.println("quantidade de apontadores com esse nome " + apontadores.size());
        sessao.clear();
        return apontadores;
    }

    public String goToApontador() {
        apontador = new Apontador();
        listarApontadores();
        return "apontado.xhtml";
    }

    
    public ApontadorService() {
    }

}
