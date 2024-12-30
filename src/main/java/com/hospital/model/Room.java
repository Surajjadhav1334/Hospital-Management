package com.hospital.model;

public class Room {
	private int roomId;
	private String roomType;
	private String availabilityStatus;
	private double chargesPerDay;
	private String assignedPatient;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(int roomId, String roomType, String availabilityStatus, double chargesPerDay, String assignedPatient) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.availabilityStatus = availabilityStatus;
		this.chargesPerDay = chargesPerDay;
		this.assignedPatient = assignedPatient;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public double getChargesPerDay() {
		return chargesPerDay;
	}

	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}

	public String getAssignedPatient() {
		return assignedPatient;
	}

	public void setAssignedPatient(String assignedPatient) {
		this.assignedPatient = assignedPatient;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", availabilityStatus=" + availabilityStatus
				+ ", chargesPerDay=" + chargesPerDay + ", assignedPatient=" + assignedPatient + "]";
	}

}
