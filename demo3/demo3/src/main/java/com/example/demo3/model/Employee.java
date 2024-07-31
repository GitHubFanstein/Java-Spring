package com.example.demo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_karyawan")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Karyawan")
    private Integer karyawanId;

    @Column(name = "Tmpt_Lahir")
    private String tempatLahir;

    @Column(name = "Tgl_Lahir")
    private String tanggalLahir;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Telp")
    private Integer telp;

    @Column(name = "Alamat")
    private String alamat;

    @Column(name = "Nama_Karyawan")
    private String nameEmployee;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "ID_User")
    private User user;

    public Integer getKaryawanId() {
        return karyawanId;
    }

    public void setKaryawanId(Integer karyawanId) {
        this.karyawanId = karyawanId;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getTelp() {
        return telp;
    }

    public void setTelp(Integer telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
