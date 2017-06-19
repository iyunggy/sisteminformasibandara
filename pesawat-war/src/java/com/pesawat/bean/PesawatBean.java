/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.bean;

import com.pesawat.facade.PesawatFacadeLocal;
import com.pesawat.model.Pesawat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author KHOIRUL
 */
@ManagedBean(name = "pesawatBean")
@SessionScoped
public class PesawatBean implements Serializable {
    
    @EJB
    private PesawatFacadeLocal pesawatDao;
    private List<Pesawat> pesawats = new ArrayList<>();
    private Pesawat pesawat;
    
    public PesawatBean(){
        
    }
public Pesawat getPesawat(){
    return pesawat;
}

public void setPesawat(Pesawat pesawat) {
    this.pesawat = pesawat;
}

public List<Pesawat> getPesawats(){
    pesawats = pesawatDao.findAll();
    return pesawats;
}

public void submitPesawat(ActionEvent e) {
    try{
        if(this.getPesawat().getId() == 0) { pesawatDao.create(this.getPesawat()); return; }
        pesawatDao.edit(this.getPesawat());
    } catch(Exception ex) {
        System.out.print(ex.toString());
    }
}

public void edit(Pesawat p){
    this.pesawat = p;
}

public void add(ActionEvent e){
    this.pesawat = new Pesawat();
}

}
