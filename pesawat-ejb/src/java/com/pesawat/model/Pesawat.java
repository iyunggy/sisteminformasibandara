/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MuhammadKhoirul
 */
@Entity
@Table(name = "pesawat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pesawat.findAll", query = "SELECT p FROM Pesawat p")
    , @NamedQuery(name = "Pesawat.findById", query = "SELECT p FROM Pesawat p WHERE p.id = :id")
    , @NamedQuery(name = "Pesawat.findByMaskapai", query = "SELECT p FROM Pesawat p WHERE p.maskapai = :maskapai")
    , @NamedQuery(name = "Pesawat.findByKelas", query = "SELECT p FROM Pesawat p WHERE p.kelas = :kelas")
    , @NamedQuery(name = "Pesawat.findByTujuan", query = "SELECT p FROM Pesawat p WHERE p.tujuan = :tujuan")})
public class Pesawat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id = 0L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "maskapai")
    private String maskapai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "kelas")
    private String kelas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tujuan")
    private String tujuan;

    public Pesawat() {
    }

    public Pesawat(Long id) {
        this.id = id;
    }

    public Pesawat(Long id, String maskapai, String kelas, String tujuan) {
        this.id = id;
        this.maskapai = maskapai;
        this.kelas = kelas;
        this.tujuan = tujuan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesawat)) {
            return false;
        }
        Pesawat other = (Pesawat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesawat.model.Pesawat[ id=" + id + " ]";
    }
    
}
