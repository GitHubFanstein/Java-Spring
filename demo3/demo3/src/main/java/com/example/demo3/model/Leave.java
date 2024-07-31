package com.example.demo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name = "tbl_cuti")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Cuti")
    private Long leaveId;

    @Column(name = "ID_Karyawan")
    private Long employeeId;

    @Column(name = "ID_Jenis_Cuti")
    private Integer typeOfLeaveId;

    @Column(name = "Tanggal_Mulai_Cuti")
    private String startDateLeave;

    @Column(name = "Tanggal_Selesai_Cuti")
    private String endDateLeave;

    @Column(name = "Status_Pengajuan")
    private String statusRequest;

    @Column(name = "Keterangan")
    private String description;

    @Column(name = "Jumlah_Pengajuan_cuti")
    private byte requestLeave;

    @Column(name = "ID_sisa_cuti")
    private Long leaveBalanceId;

    public Long getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Long leaveId) {
        this.leaveId = leaveId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getTypeOfLeaveId() {
        return typeOfLeaveId;
    }

    public void setTypeOfLeaveId(Integer typeOfLeaveId) {
        this.typeOfLeaveId = typeOfLeaveId;
    }

    public String getStartDateLeave() {
        return startDateLeave;
    }

    public void setStartDateLeave(String startDateLeave) {
        this.startDateLeave = startDateLeave;
    }

    public String getEndDateLeave() {
        return endDateLeave;
    }

    public void setEndDateLeave(String endDateLeave) {
        this.endDateLeave = endDateLeave;
    }

    public String getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(String statusRequest) {
        this.statusRequest = statusRequest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getRequestLeave() {
        return requestLeave;
    }

    public void setRequestLeave(byte requestLeave) {
        this.requestLeave = requestLeave;
    }

    public Long getLeaveBalanceId() {
        return leaveBalanceId;
    }

    public void setLeaveBalanceId(Long leaveBalanceId) {
        this.leaveBalanceId = leaveBalanceId;
    }

    
    
}
