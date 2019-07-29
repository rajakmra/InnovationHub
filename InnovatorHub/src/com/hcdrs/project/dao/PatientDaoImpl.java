package com.hcdrs.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hcdrs.project.bean.NewPatient;
import com.hcdrs.project.bean.NewPatientHistory;
import com.hcdrs.project.bean.Patient;
import com.hcdrs.project.bean.PatientHistory;
import com.mongodb.client.result.UpdateResult;



public class PatientDaoImpl implements PatientDao  {
	private static final String COLLECTION = "patient";
	 @Autowired
		JdbcTemplate jdbcTemplate;
	    @Autowired
	    MongoTemplate mongoTemplate;
	    
	    
	    public JdbcTemplate getJdbcTemplate() {
	        return jdbcTemplate;
	    }


	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }
	    public MongoTemplate getMongoTemplate() {
	        return mongoTemplate;
	    }

	    public void setMongoTemplate(MongoTemplate mongoTemplate) {
	        this.mongoTemplate = mongoTemplate;
	    }    

	@Override
	public void patientRegistration(NewPatient patient) {
		
		mongoTemplate.insert(patient);
		
	}
	@Override
    public List findAll() {
        return (List) mongoTemplate.findAll(NewPatient.class, COLLECTION);
    }


	@Override
	public long patientUpdate(long PatientId, String Email) {
		long l=0;
		if(PatientId != 0) {
		Query query=new Query();
		query.addCriteria(Criteria.where("Patient_Id").is(PatientId));
		Update update=new Update();
		update.set("Email",Email);
		
		UpdateResult res=mongoTemplate.updateFirst(query, update,NewPatient.class);
		
		 l = res.getModifiedCount();
	}
	
     return l;
    
    }
	@Override
    public long updateHistory(NewPatientHistory phistory, long patientId) {
        long l = 0;
        Query query = new Query();
        query.addCriteria(Criteria.where("patient_Id").is(patientId));
        Update update = new Update();
        update.push("record",phistory);
        UpdateResult res = mongoTemplate.updateFirst(query, update, NewPatient.class);
     
        l = res.getModifiedCount();
        return l;
    }


	@Override
	public boolean login(NewPatient p) {
		boolean l=false;

		Query query=new Query();
		query.addCriteria(Criteria.where("UserName").is(p.getUserName()).and("Password").is(p.getPassword()));
		
		NewPatient res=mongoTemplate.findOne(query,NewPatient.class);
		if(res != null) {
			l = true;
		}
		return l;
	}


    @Override
    public boolean findByUsername(NewPatient p) {
        boolean l=false;

        Query query=new Query();
        query.addCriteria(Criteria.where("UserName").is(p.getUserName()).and("Password").is(p.getPassword()));
        
        NewPatient res=mongoTemplate.findOne(query,NewPatient.class);
        if(res != null) {
                l = true;
        }
        return l;
    }
	


}
