package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Patient;
import com.hospital.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientservice;
	
	@PostMapping("api/patient/{id}")
	public String addpatient(@RequestBody Patient patient, @PathVariable("id") int id)
	{
		String addpat = patientservice.addpatient(patient, id);
		return addpat;
	}
	
	@GetMapping("api/patient")
	public List<Patient> getallpatient()
	{
		return patientservice.getallpatient();
	}
	
	@GetMapping("api/patient/{id}")
	public Patient getpatientbyid(@PathVariable("id") int id)
	{
		return patientservice.getpatientnyid(id);
	}
	
	@PutMapping("api/patient/{id}")
	
	public String updatepatientbyid(@PathVariable("id") int id, @RequestBody Patient patient) {
		
		return patientservice.updatepatientbyid(id, patient);
	}
	
	@DeleteMapping("api/patient/{id}")
	public String deletepatient(@PathVariable("id") int id)
	{
		return patientservice.deletepatient(id);
	}
	
}

