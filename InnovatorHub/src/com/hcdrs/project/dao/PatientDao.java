package com.hcdrs.project.dao;

import java.util.List;

import com.hcdrs.project.bean.NewPatient;
import com.hcdrs.project.bean.NewPatientHistory;
import com.hcdrs.project.bean.Patient;
import com.hcdrs.project.bean.PatientHistory;

interface PatientDao {
	public void patientRegistration(NewPatient patient);
	public boolean login(NewPatient p);
	public boolean findByUsername(NewPatient patient);
	public List findAll();
	public long patientUpdate(long Patient_Id,String Email);
	public long updateHistory(NewPatientHistory phistory, long patientid);
}
