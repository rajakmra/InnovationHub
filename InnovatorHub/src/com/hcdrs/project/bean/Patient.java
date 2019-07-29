package com.hcdrs.project.bean;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection ="patient_info")
public class Patient {
	Long Patient_Id;
	Long Aadar_Id;
	String  Patient_Name;
	String  Address;
	Long Contact_Number;
	String Contact_Persion; 
	String Email; 
	String Registered_Date; 
	String Short_Description;
	String  Detail_Description;
	String Status;
	String  Registered_Hospital_Id;
	String UserName;
	String Password;
	ArrayList<PatientHistory> Record;
	public Patient() {
		
	}
	public Patient(Long patient_Id, Long aadar_Id, String patient_Name, String address, Long contact_Number,
			String contact_Persion, String email, String registered_Date, String short_Description,
			String detail_Description,String status, String registered_Hospital_Id, String userName, String password,ArrayList<PatientHistory> record) {
		super();
		Patient_Id = patient_Id;
		Aadar_Id = aadar_Id;
		Patient_Name = patient_Name;
		Address = address;
		Contact_Number = contact_Number;
		Contact_Persion = contact_Persion;
		Email = email;
		Registered_Date = registered_Date;
		Short_Description = short_Description;
		Detail_Description = detail_Description;
		Registered_Hospital_Id = registered_Hospital_Id;
		UserName = userName;
		Password = password;
		Record=record;
	}
	public Long getPatient_Id() {
		return Patient_Id;
	}
	public void setPatient_Id(Long patient_Id) {
		Patient_Id = patient_Id;
	}
	public Long getAadar_Id() {
		return Aadar_Id;
	}
	public void setAadar_Id(Long aadar_Id) {
		Aadar_Id = aadar_Id;
	}
	public String getPatient_Name() {
		return Patient_Name;
	}
	public void setPatient_Name(String patient_Name) {
		Patient_Name = patient_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(Long contact_Number) {
		Contact_Number = contact_Number;
	}
	public String getContact_Persion() {
		return Contact_Persion;
	}
	public void setContact_Persion(String contact_Persion) {
		Contact_Persion = contact_Persion;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRegistered_Date() {
		return Registered_Date;
	}
	public void setRegistered_Date(String registered_Date) {
		Registered_Date = registered_Date;
	}
	public String getShort_Description() {
		return Short_Description;
	}
	public void setShort_Description(String short_Description) {
		Short_Description = short_Description;
	}
	public String getDetail_Description() {
		return Detail_Description;
	}
	public void setDetail_Description(String detail_Description) {
		Detail_Description = detail_Description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getRegistered_Hospital_Id() {
		return Registered_Hospital_Id;
	}
	public void setRegistered_Hospital_Id(String registered_Hospital_Id) {
		Registered_Hospital_Id = registered_Hospital_Id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public ArrayList<PatientHistory> getRecord() {
        return Record;
    }

    public void setPatientRecord(ArrayList<PatientHistory> patientRecord) {
        this.Record = patientRecord;
    }
	@Override
	public String toString() {
		return "Patient [Patient_Id=" + Patient_Id + ", Aadar_Id=" + Aadar_Id + ", Patient_Name=" + Patient_Name
				+ ", Address=" + Address + ", Contact_Number=" + Contact_Number + ", Contact_Persion=" + Contact_Persion
				+ ", Email=" + Email + ", Registered_Date=" + Registered_Date + ", Short_Description="
				+ Short_Description + ", Detail_Description=" + Detail_Description + ", Status=" + Status
				+ ", Registered_Hospital_Id=" + Registered_Hospital_Id + ", UserName=" + UserName + ", Password="
				+ Password + ", Record=" + Record + "]";
	}

}
	