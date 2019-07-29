package com.hcdrs.project.bean;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection ="patient_information")
public class NewPatient {
    
    Long patient_Id;
    Long aadar_Id;
    String patient_Name;
    String address;
    Long contact_Number;
    String contact_Persion; 
    String email; 
    String registered_Date; 
    String short_Description;
    String detail_Description;
    String status;
    String registered_Hospital_Id;
    String userName;
    String password;
    ArrayList<NewPatientHistory> record;
    
    
    public NewPatient() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public NewPatient(Long patient_Id, Long aadar_Id, String patient_Name, String address, Long contact_Number, String contact_Persion, String email, String registered_Date, String short_Description, String detail_Description, String status,
        String registered_Hospital_Id, String userName, String password, ArrayList<NewPatientHistory> record) {
        super();
        this.patient_Id = patient_Id;
        this.aadar_Id = aadar_Id;
        this.patient_Name = patient_Name;
        this.address = address;
        this.contact_Number = contact_Number;
        this.contact_Persion = contact_Persion;
        this.email = email;
        this.registered_Date = registered_Date;
        this.short_Description = short_Description;
        this.detail_Description = detail_Description;
        this.status = status;
        this.registered_Hospital_Id = registered_Hospital_Id;
        this.userName = userName;
        this.password = password;
        this.record = record;
    }


    public Long getPatient_Id() {
        return patient_Id;
    }
    public void setPatient_Id(Long patient_Id) {
        this.patient_Id = patient_Id;
    }
    public Long getAadar_Id() {
        return aadar_Id;
    }
    public void setAadar_Id(Long aadar_Id) {
        this.aadar_Id = aadar_Id;
    }
    public String getPatient_Name() {
        return patient_Name;
    }
    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getContact_Number() {
        return contact_Number;
    }
    public void setContact_Number(Long contact_Number) {
        this.contact_Number = contact_Number;
    }
    public String getContact_Persion() {
        return contact_Persion;
    }
    public void setContact_Persion(String contact_Persion) {
        this.contact_Persion = contact_Persion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRegistered_Date() {
        return registered_Date;
    }
    public void setRegistered_Date(String registered_Date) {
        this.registered_Date = registered_Date;
    }
    public String getShort_Description() {
        return short_Description;
    }
    public void setShort_Description(String short_Description) {
        this.short_Description = short_Description;
    }
    public String getDetail_Description() {
        return detail_Description;
    }
    public void setDetail_Description(String detail_Description) {
        this.detail_Description = detail_Description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRegistered_Hospital_Id() {
        return registered_Hospital_Id;
    }
    public void setRegistered_Hospital_Id(String registered_Hospital_Id) {
        this.registered_Hospital_Id = registered_Hospital_Id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<NewPatientHistory> getRecord() {
        return record;
    }
    public void setRecord(ArrayList<NewPatientHistory> record) {
        this.record = record;
    }
    
    

}
