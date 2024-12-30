package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.dao.RoomDao;
import com.hospital.model.Patient;
import com.hospital.model.Room;

@Component
public class RoomService {

	@Autowired
	RoomDao roomdao;
	
	public String addroom(Room room, int id)
	{
		return roomdao.addroom(room, id);
	}
	
	public List<Room> getallrooms()
	{
		return roomdao.getallrooms();
	}
	
	public Room getroombyid(int id)
	{
		return roomdao.getroombyid(id);
	}
	
	public String updateroombyid(int id, Room room)
	{
		return roomdao.updateroombyid(id, room);
	}

	public String deleteroomby(int id) {
		
		return roomdao.deleteroomby(id);
	}
}
