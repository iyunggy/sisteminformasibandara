/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.facade;

import com.pesawat.model.Pesawat;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MuhammadKhoirul
 */
@Stateless
public class PesawatFacade extends AbstractFacade<Pesawat> implements PesawatFacadeLocal {

    @PersistenceContext(unitName = "pesawat-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PesawatFacade() {
        super(Pesawat.class);
    }
    
}
