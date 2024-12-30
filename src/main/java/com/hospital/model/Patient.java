package com.hospital.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Patient {
	private int patientId;
	private String patientName;
	private String disease;
	private int age;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName, String disease, int age) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.age = age;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease + ", age="
				+ age + "]";
	}

}
