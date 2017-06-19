/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MuhammadKhoirul
 */
@Entity
@Table(name = "booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
    , @NamedQuery(name = "Booking.findById", query = "SELECT b FROM Booking b WHERE b.id = :id")
    , @NamedQuery(name = "Booking.findByNoIdentitas", query = "SELECT b FROM Booking b WHERE b.noIdentitas = :noIdentitas")
    , @NamedQuery(name = "Booking.findByAlamatEmail", query = "SELECT b FROM Booking b WHERE b.alamatEmail = :alamatEmail")
    , @NamedQuery(name = "Booking.findByNamaDepan", query = "SELECT b FROM Booking b WHERE b.namaDepan = :namaDepan")
    , @NamedQuery(name = "Booking.findByNamaBelakang", query = "SELECT b FROM Booking b WHERE b.namaBelakang = :namaBelakang")
    , @NamedQuery(name = "Booking.findByJenisKelamin", query = "SELECT b FROM Booking b WHERE b.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Booking.findByNoTelepon", query = "SELECT b FROM Booking b WHERE b.noTelepon = :noTelepon")
    , @NamedQuery(name = "Booking.findByTempatLahir", query = "SELECT b FROM Booking b WHERE b.tempatLahir = :tempatLahir")
    , @NamedQuery(name = "Booking.findByTanggalLahir", query = "SELECT b FROM Booking b WHERE b.tanggalLahir = :tanggalLahir")
    , @NamedQuery(name = "Booking.findByMaskapai", query = "SELECT b FROM Booking b WHERE b.maskapai = :maskapai")
    , @NamedQuery(name = "Booking.findByKelas", query = "SELECT b FROM Booking b WHERE b.kelas = :kelas")
    , @NamedQuery(name = "Booking.findByTujuan", query = "SELECT b FROM Booking b WHERE b.tujuan = :tujuan")})
public class Booking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id = 0L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "noIdentitas")
    private long noIdentitas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
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
    @Size(min = 1, max = 1)
    @Column(name = "jenisKelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "noTelepon")
    private String noTelepon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tempatLahir")
    private String tempatLahir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggalLahir")
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
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

    public Booking() {
    }

    public Booking(Long id) {
        this.id = id;
    }

    public Booking(Long id, long noIdentitas, String alamatEmail, String namaDepan, String namaBelakang, String jenisKelamin, String noTelepon, String tempatLahir, Date tanggalLahir, String maskapai, String kelas, String tujuan) {
        this.id = id;
        this.noIdentitas = noIdentitas;
        this.alamatEmail = alamatEmail;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.jenisKelamin = jenisKelamin;
        this.noTelepon = noTelepon;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
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

    public long getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(long noIdentitas) {
        this.noIdentitas = noIdentitas;
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

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
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
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesawat.model.Booking[ id=" + id + " ]";
    }
    
}
