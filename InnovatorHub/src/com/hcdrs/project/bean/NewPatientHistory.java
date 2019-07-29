package com.hcdrs.project.bean;

import org.springframework.stereotype.Component;

@Component
public class NewPatientHistory {

    String visited_Date;
    String visited_Time;
    String cause;
    String visited_HospitalId;
    String attended_DoctorId;
    String prescription;
    String suggestion;
    String remarks;
    
    
    public NewPatientHistory() {
        super();
        // TODO Auto-generated constructor stub
    }


    public NewPatientHistory(String visited_Date, String visited_Time, String cause, String visited_HospitalId, String attended_DoctorId, String prescription, String suggestion, String remarks) {
        super();
        this.visited_Date = visited_Date;
        this.visited_Time = visited_Time;
        this.cause = cause;
        this.visited_HospitalId = visited_HospitalId;
        this.attended_DoctorId = attended_DoctorId;
        this.prescription = prescription;
        this.suggestion = suggestion;
        this.remarks = remarks;
    }


    public String getVisited_Date() {
        return visited_Date;
    }


    public void setVisited_Date(String visited_Date) {
        this.visited_Date = visited_Date;
    }


    public String getVisited_Time() {
        return visited_Time;
    }


    public void setVisited_Time(String visited_Time) {
        this.visited_Time = visited_Time;
    }


    public String getCause() {
        return cause;
    }


    public void setCause(String cause) {
        this.cause = cause;
    }


    public String getVisited_HospitalId() {
        return visited_HospitalId;
    }


    public void setVisited_HospitalId(String visited_HospitalId) {
        this.visited_HospitalId = visited_HospitalId;
    }


    public String getAttended_DoctorId() {
        return attended_DoctorId;
    }


    public void setAttended_DoctorId(String attended_DoctorId) {
        this.attended_DoctorId = attended_DoctorId;
    }


    public String getPrescription() {
        return prescription;
    }


    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }


    public String getSuggestion() {
        return suggestion;
    }


    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }


    public String getRemarks() {
        return remarks;
    }


    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    

    
}
