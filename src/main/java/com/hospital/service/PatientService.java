package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospital.dao.PatientDao;
import com.hospital.model.Patient;

@Component
public class PatientService {
	
	@Autowired
	PatientDao patientdao;
	
	public String addpatient(Patient patient, int id)
	{
		return patientdao.addpatient(patient, id);
	}
	
	public List<Patient> getallpatient()
	{
		return patientdao.getallpatient();
	}
	
	public Patient getpatientnyid(int id)
	{
		return patientdao.getpatientbyid(id);
	}
	
	public String updatepatientbyid(int id, Patient patient)
	{
		return patientdao.updatepatientbyid(id, patient);
	}
	
	public String deletepatient(int id)
	{
		return patientdao.deletepatient(id);
	}

}
