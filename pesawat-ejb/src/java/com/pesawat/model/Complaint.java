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
import javax.persistence.Lob;
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
@Table(name = "complaint")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Complaint.findAll", query = "SELECT c FROM Complaint c")
    , @NamedQuery(name = "Complaint.findById", query = "SELECT c FROM Complaint c WHERE c.id = :id")
    , @NamedQuery(name = "Complaint.findByAlamatEmail", query = "SELECT c FROM Complaint c WHERE c.alamatEmail = :alamatEmail")
    , @NamedQuery(name = "Complaint.findByNamaDepan", query = "SELECT c FROM Complaint c WHERE c.namaDepan = :namaDepan")
    , @NamedQuery(name = "Complaint.findByNamaBelakang", query = "SELECT c FROM Complaint c WHERE c.namaBelakang = :namaBelakang")})
public class Complaint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id = 0L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "alamatEmail")
    private String alamatEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "namaDepan")
    private String namaDepan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "namaBelakang")
    private String namaBelakang;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "isiKeluhan")
    private String isiKeluhan;

    public Complaint() {
    }

    public Complaint(Long id) {
        this.id = id;
    }

    public Complaint(Long id, String alamatEmail, String namaDepan, String namaBelakang, String isiKeluhan) {
        this.id = id;
        this.alamatEmail = alamatEmail;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.isiKeluhan = isiKeluhan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }
    
    
    
    public String getNamaLengkap() {
       return this.namaDepan + ' ' + this.namaBelakang;
    }

    public String getIsiKeluhan() {
        return isiKeluhan;
    }

    public void setIsiKeluhan(String isiKeluhan) {
        this.isiKeluhan = isiKeluhan;
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
        if (!(object instanceof Complaint)) {
            return false;
        }
        Complaint other = (Complaint) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesawat.model.Complaint[ id=" + id + " ]";
    }
    
}
