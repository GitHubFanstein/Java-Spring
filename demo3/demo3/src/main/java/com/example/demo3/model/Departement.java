package com.example.demo3.model;

// import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_departemen")
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Departemen")
    private Integer departementID;

    @Column(name = "Departemen_Name")
    private String departementName;
    

    // Getters and Setters

    public Integer getDepartementID() {
        return departementID;
    }

    public void setDepartementID(Integer departementID) {
        this.departementID = departementID;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

}
