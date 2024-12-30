package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospital.dao.DoctorDao;
import com.hospital.model.Doctor;

@Component
public class DoctorService {
	
	@Autowired
	DoctorDao doctorDao;
	
	public String adddoctor(Doctor doctor, int id)
	{
		return doctorDao.adddoctor(doctor, id);
	}
	
	public List<Doctor> getalldoctors()
	{
		return doctorDao.getalldoctors();
	}
	
	public Doctor getdoctorbyid(int id)
	{
		return doctorDao.getdoctorbyid(id);
	}
	
	public String updatedoctorbyid(Doctor doctor, int id)
	{
		return doctorDao.updatedoctorbyid(doctor, id);
	}
	
	public String deletedoctor(int id)
	{
		return doctorDao.deletedoctor(id);
	}

}
