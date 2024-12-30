package com.hospital.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.hospital.model.Doctor;

@Repository
public class DoctorDao {
	
	List<Doctor> doctorlist = new ArrayList<Doctor>();
	
	public DoctorDao() {
		// TODO Auto-generated constructor stub
		doctorlist.add(new Doctor(1, "Kaushal", "Homeopathy", 10));
		doctorlist.add(new Doctor(2, "Abhay", "Dentist", 20));
	}
	
	public String adddoctor(Doctor doctor, int id)
	{
		for (Doctor doctor1 : doctorlist) {
			if (doctor1.getDoctorId() == id) {
				return "already exists";
			}
		}
		doctorlist.add(doctor);
		return "added";
	}
	
	public List<Doctor> getalldoctors()
	{
		return doctorlist;
	}
	
	public Doctor getdoctorbyid(int id)
	{
		for (int i = 0; i < doctorlist.size(); i++) {
			Doctor doctor = doctorlist.get(i);
			if (doctor.getDoctorId() == id) {
				return doctor;
			}
		}
		return null;
	}
	
	public String updatedoctorbyid(Doctor doctor, int id)
	{
		for (int i = 0; i < doctorlist.size(); i++) {
			Doctor getdoctor = doctorlist.get(i);
			if (getdoctor.getDoctorId() == id) {
				doctorlist.set(i, doctor);
				return "updated";
			}
		}
		return "not found";
	}
	
	public String deletedoctor(int id)
	{
		for (int i = 0; i < doctorlist.size(); i++) {
			Doctor doctor = doctorlist.get(i);
			if (doctor.getDoctorId() == id) {
				doctorlist.remove(doctor);
				return "deleted";
			}
		}
		return "not found";
	}

}
