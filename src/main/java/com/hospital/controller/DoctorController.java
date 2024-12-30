package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	DoctorService doctorservice;

	@PostMapping("api/doctor")
	public String adddoctor(@RequestBody Doctor doctor, @RequestParam int id) {
		return doctorservice.adddoctor(doctor, id);

	}

	@GetMapping("api/doctor")
	public List<Doctor> getalldoctors() {
		return doctorservice.getalldoctors();
	}

	@GetMapping("api/doctor/{id}")
	public Object getdoctorbyid(@PathVariable("id") int id) {
		Doctor doctor = doctorservice.getdoctorbyid(id);

		if (doctor != null) {

			return doctor;
		} else {
			return "not found";
		}

	}
	
	@PutMapping("api/doctor/{id}")
	public String updatedoctorbyid(@PathVariable("id") int id, @RequestBody Doctor doctor)
	{
		return doctorservice.updatedoctorbyid(doctor, id);
		
	}
	
	@DeleteMapping("api/doctor/{id}")
	public String deletedoctor(@PathVariable("id") int id)
	{
		return doctorservice.deletedoctor(id);
	}

}
