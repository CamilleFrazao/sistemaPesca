/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemapesca.test;

import br.com.sistemapesca.models.Apontador;
import br.com.sistemapesca.models.Pessoa;
import br.com.sistemapesca.models.Tecnico;
import br.com.sistemapesca.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestesBrutos {

    public static void main(String[] args) {
        Apontador a = new Apontador();

        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = sessao.beginTransaction();
        try {
            List<Apontador> as = new ArrayList<>();
            as = sessao.createCriteria(Apontador.class).list();
            System.out.println("Quantidade no banco" + as.size());
            a = as.get(0);
            sessao.delete(a);
            System.out.println("Quantidade no banco" + as.size());

//            while (!as.isEmpty()) {
//                as.remove(0);
//            }
            System.out.println("AQUIEEEEEEEE " + as.size());

//        Pessoa p = new Pessoa();
//        p.setNome("JOHN TESTE");
//        p.setTelefone("9090909090");
//        p.setDataCadastro(new Date());
//        Tecnico t = new Tecnico();
//        t.getPessoa().setNome("Camille Frazão");
//        t.getPessoa().setDataCadastro(new Date());
//        
//        Apontador a = new Apontador();
//        a.getPessoa().setNome("John Gomes");
//        a.getPessoa().setDataCadastro(new Date());
//        a.getPessoa().setTelefone("9879887");
            trans.commit();

        } catch (Exception e) {
            System.out.println("DEU MERDA");
        } finally {
            sessao.close();
        }

    }
}
