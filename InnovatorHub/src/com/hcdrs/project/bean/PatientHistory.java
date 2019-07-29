package com.hcdrs.project.bean;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
public class PatientHistory {
	    //long Patient_Id;
		String Visited_Date;
		String Visited_Time;
		String Cause;
		String Visited_HospitalId;
		String Attended_DoctorId;
		String Prescription;
		String Suggestion;
		String Remarks;
		
		public PatientHistory() {
			
		}

		public PatientHistory(long patient_Id,String visited_Date, String visited_Time, String cause, String visited_HospitalId,
				String attended_DoctorId, String prescription, String suggestion, String remarks) {
			super();
			//Patient_Id = patient_Id;
		
			Visited_Date = visited_Date;
			Visited_Time = visited_Time;
			Cause = cause;
			Visited_HospitalId = visited_HospitalId;
			Attended_DoctorId = attended_DoctorId;
			Prescription = prescription;
			Suggestion = suggestion;
			Remarks = remarks;
		}

/*		public long getPatient_Id() {
			return Patient_Id;
		}

		public void setPatient_Id(long patient_Id) {
			Patient_Id = patient_Id;
		}
*/
		public String getVisited_Date() {
			return Visited_Date;
		}

		public void setVisited_Date(String visited_Date) {
			Visited_Date = visited_Date;
		}

		public String getVisited_Time() {
			return Visited_Time;
		}

		public void setVisited_Time(String visited_Time) {
			Visited_Time = visited_Time;
		}

		public String getCause() {
			return Cause;
		}

		public void setCause(String cause) {
			Cause = cause;
		}

		public String getVisited_HospitalId() {
			return Visited_HospitalId;
		}

		public void setVisited_HospitalId(String visited_HospitalId) {
			Visited_HospitalId = visited_HospitalId;
		}

		public String getAttended_DoctorId() {
			return Attended_DoctorId;
		}

		public void setAttended_DoctorId(String attended_DoctorId) {
			Attended_DoctorId = attended_DoctorId;
		}

		public String getPrescription() {
			return Prescription;
		}

		public void setPrescription(String prescription) {
			Prescription = prescription;
		}

		public String getSuggestion() {
			return Suggestion;
		}

		public void setSuggestion(String suggestion) {
			Suggestion = suggestion;
		}

		public String getRemarks() {
			return Remarks;
		}

		public void setRemarks(String remarks) {
			Remarks = remarks;
		}
		
}		