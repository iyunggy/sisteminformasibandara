/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author KHOIRUL
 */
@ManagedBean(name = "navigasiBean")
@RequestScoped
public class NavigasiBean {
    /*
    Create a new instance of NavigasiBean
    */
    public NavigasiBean() {
        
    }
    
    public String goToComplaintInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/complaint/form.xhtml?faces-redirect=true";
    }
    
    public String goToComplaintListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/complaint/index.xhtml?faces-redirect=true";
    }
    
    public String goToBookingInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/booking/form.xhtml?faces-redirect=true";
    }
    
    public String goToBookingListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/booking/index.xhtml?faces-redirect=true";
    }
    
    public String goToPesawatInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/tambah/form.xhtml?faces-redirect=true";
    }
    
    public String goToPesawatListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/tambah/index.xhtml?faces-redirect=true";
    }
}
