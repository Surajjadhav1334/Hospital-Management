package com.hospital.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospital.model.Patient;

@Repository
public class PatientDao {
	
	List<Patient> patientlist = new ArrayList<Patient>();
	
	public PatientDao() {
	   patientlist.add(new Patient(1, "John", "Fleu", 30));
	   patientlist.add(new Patient(2, "Cena", "Cough", 20));
	}
	
	
	public String addpatient(Patient patient, int id)
	{
		for (Patient patient1 : patientlist) {
			if (patient1.getPatientId() == id) {
				return "already exists";
			}
		}
		patientlist.add(patient);
		return "added";
	}
	
	public List<Patient> getallpatient()
	{
		return patientlist;
	}
	
	public Patient getpatientbyid(int id)
	{
		for (int i = 0; i < patientlist.size(); i++) {
			
			Patient patientid = patientlist.get(i);
			
			if (patientid.getPatientId() == id) {
				return patientid;
			}
			
		}
		return null;
	}
	
	public String updatepatientbyid(int id, Patient patient)
	{
		for (int i = 0; i < patientlist.size(); i++) {
			Patient patientupdate = patientlist.get(i);
			if (patientupdate.getPatientId() == id) {
				patientlist.set(i, patient);
				return "okay";
			}
		}
		return "not okay";
	}
	
	public String deletepatient(@PathVariable("id") int id)
	{
		for (int i = 0; i < patientlist.size(); i++) {
			Patient delete = patientlist.get(i);
			if (delete.getPatientId()==id) {
				patientlist.remove(delete);
				return "deleted";
			}
		}
		return "not deleted";
	}
}
