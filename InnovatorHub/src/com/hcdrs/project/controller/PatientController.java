package com.hcdrs.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcdrs.project.bean.NewPatient;
import com.hcdrs.project.bean.NewPatientHistory;
import com.hcdrs.project.bean.Patient;
import com.hcdrs.project.bean.PatientHistory;
import com.hcdrs.project.dao.PatientDaoImpl;

@Controller
public class PatientController {
    @Autowired
    private NewPatient patient;
    @Autowired
    private NewPatientHistory phistory;

    private ArrayList<NewPatientHistory> record;
    @Autowired
    private PatientDaoImpl patientDaoImpl;
    
    @RequestMapping("/pregistration")
    public ModelAndView sayHello() {
        
        ModelAndView mav = new ModelAndView("PatientRegistration");
        mav.addObject("msg","Welcome to Annotation based Spring MVC");
        return mav;
    }
    
    @RequestMapping("/PatientReg")
    public ModelAndView insertPatient(@RequestParam Map<String,String> parms) {               
        
        String patientId = parms.get("patient_id");
        String aadarId = parms.get("aadar_id");
        String patientName = parms.get("patient_name");        
        String address = parms.get("address");
        String contactNo = parms.get("contact_number");
        String contactperson = parms.get("contact_person");
        String contactEmail = parms.get("email");
        String regDate = parms.get("reg_date");
        String lastVisitedDate = regDate;        
        String shortDescription = parms.get("short_description");
        String detailDescription = parms.get("detail_description");
        String status = "NEW";
        String registeredHospitalId = parms.get("hospital_id");
        String username=parms.get("username");
        String password=parms.get("password");
                
        patient.setPatient_Id(Long.parseLong(patientId));
        patient.setAadar_Id(Long.parseLong(aadarId));
        patient.setPatient_Name(patientName);
        patient.setAddress(address);
        patient.setContact_Number(Long.parseLong(contactNo));
        patient.setContact_Persion(contactperson);
        patient.setEmail(contactEmail);
        patient.setRegistered_Date(regDate);
        patient.setShort_Description(shortDescription);
        patient.setDetail_Description(detailDescription);
        patient.setStatus(status);
        patient.setRegistered_Hospital_Id(registeredHospitalId);
        patient.setUserName(username);
        patient.setPassword(password);
        
        phistory.setVisited_Date(lastVisitedDate);
        phistory.setVisited_Time("");
        phistory.setCause("");
        phistory.setVisited_HospitalId(registeredHospitalId);
        phistory.setAttended_DoctorId("");
        phistory.setPrescription("");
        phistory.setSuggestion("");
        phistory.setRemarks("");
        record = new ArrayList<NewPatientHistory>();
        record.add(phistory);
        patient.setRecord(record);
        
        patientDaoImpl.patientRegistration(patient);
        
        ModelAndView mav = new ModelAndView("PatientLogin");
        
        mav.addObject("msg","Registration for the ,"+ patientName+ " completed Successfully...!");
        return mav;
    }
    
    @RequestMapping("/listPatient")
    public ModelAndView getpatientList() {
        
        ModelAndView mav = new ModelAndView("getpatientslist");
        mav.addObject("msg","Welcome to Annotation based Spring MVC");
        return mav;
    }
    
    @RequestMapping("/getPatients")
    public ModelAndView getAllPatients() {
      List patientList = patientDaoImpl.findAll();
        
        ModelAndView mav = new ModelAndView("display_all_patients");
        
      mav.addObject("patients",patientList);
        return mav;        
    }
    @RequestMapping("/updatePatient")
    public ModelAndView updatePatient() {
    	ModelAndView mav=new ModelAndView("update");
    	return mav;
    	
    }
    @RequestMapping("/insertUpdate")
    public ModelAndView changePatient(@RequestParam Map<String,String>parms) {
    	String PatientId=parms.get("id");
    	String Email=parms.get("email");
    	
    long l=patientDaoImpl.patientUpdate(Long.parseLong(PatientId), Email);;
    
    	ModelAndView mav=new ModelAndView("update");
    	 if(l != -1) {                        
             mav.addObject("msg","Paitent History Updated Successfully");           
         }else {
             mav.addObject("msg","Paitent History Updation Failed");                       
         }
         return mav;        
    
    	
    }
    @RequestMapping("/updatePatientHistory")
    public ModelAndView updatePatientHistory() {        
        ModelAndView mav = new ModelAndView("PatientHoistoryRegistration");
        return mav;
    }
    @RequestMapping("/insertHistory")
    public ModelAndView pushPatientHistory(@RequestParam Map<String,String> parms) {
        String patientId = parms.get("patient_id");
        long pid = Long.parseLong(patientId);
        String visitedDate = parms.get("visited_date");
        String visitedTime = parms.get("visited_Time");    
        String cause = parms.get("Cause");
        String visitedhospitalId = parms.get("Visited_HospitaId");
        String attendedDoctorId = parms.get("Attended_DoctorId");
        String prescription = parms.get("Prescription");
        String suggestion = parms.get("Suggestion");
        String remarks = parms.get("remark");
        //phistory.setPatient_Id(pid);
        phistory.setVisited_Date(visitedDate);
        phistory.setVisited_Time(visitedTime);
        phistory.setCause(cause);
        phistory.setVisited_HospitalId(visitedhospitalId);
        phistory.setAttended_DoctorId(attendedDoctorId);
        phistory.setPrescription(prescription);
        phistory.setSuggestion(suggestion);
        phistory.setRemarks(remarks);


        long l = patientDaoImpl.updateHistory(phistory, pid);
        ModelAndView mav = new ModelAndView("patient_history_update");
        if(l != -1) {                        
            mav.addObject("msg","Paitent History Pushed Successfully");           
        }else {
            mav.addObject("msg","Paitent History Push Failed");                       
        }
        return mav;        
    }    
    @RequestMapping("/patientLogin")
    public ModelAndView login() {
    	ModelAndView mav=new ModelAndView("PatientLogin");
		return mav;
    	
    }
    @RequestMapping("/loginpatient")
    public ModelAndView loginpatient(@RequestParam Map<String,String> parms)
    {
    	ModelAndView mav;
    	String username = parms.get("username");
        String password = parms.get("password");
    	patient.setUserName(username);
    	patient.setPassword(password);
    	boolean decision=patientDaoImpl.findByUsername(patient);
    	if(decision)
    	{
         mav=new ModelAndView("PatientHome");
    	}
    	else
    	{
         mav=new ModelAndView("PatientLogin");

    	}
        
    	return mav;
    }
    	
    
    


    
   

}
