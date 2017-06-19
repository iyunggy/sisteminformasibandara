/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.bean;

import com.pesawat.facade.ComplaintFacadeLocal;
import com.pesawat.model.Complaint;
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
@ManagedBean(name = "complaintBean")
@SessionScoped
public class ComplaintBean implements Serializable {
    @EJB
   private ComplaintFacadeLocal complaintDao;
    private List<Complaint> complaints=new ArrayList<>();
    private Complaint complaint;
    
    public ComplaintBean() {
        
    }
    
    public Complaint getComplaint() {
        return complaint;
    }
    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
    
    public List<Complaint> getComplaints() {
        complaints = complaintDao.findAll();
        return complaints;
    }
    public void submitComplaint(ActionEvent e) {
        try{
            if(this.getComplaint().getId()== 0){ complaintDao.create(this.getComplaint());return;}
            complaintDao.edit(this.getComplaint());
           
        }catch(Exception ex){
            System.out.print(ex.toString());
        }
    }
    
    public void edit(Complaint c) {
        this.complaint = c;
    }
    
    public void add(ActionEvent e) {
        this.complaint = new Complaint();
    }
}

