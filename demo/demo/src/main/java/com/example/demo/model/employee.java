package com.example.demo.model;

// class that represents model
public class employee {
    // declare variabel
    int karyawanId;
    String namaKaryawan;
    String tempatLahir;
    String tanggalLahir;
    String gender;
    int telp;
    String alamat;
    String email;
    int departemenId;

// define getter dan setter
    public int getKaryawanId() {
        return karyawanId;
    }
    public void setKaryawanId(int karyawanId) {
        this.karyawanId = karyawanId;
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
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
    public int getTelp() {
        return telp;
    }
    public void setTelp(int telp) {
        this.telp = telp;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getDepartemenId() {
        return departemenId;
    }
    public void setDepartemenId(int departemenId) {
        this.departemenId = departemenId;
    } 
}

