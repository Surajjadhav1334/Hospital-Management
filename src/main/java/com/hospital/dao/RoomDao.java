package com.hospital.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hospital.model.Patient;
import com.hospital.model.Room;

@Repository
public class RoomDao {
	
	List<Room> roomlist = new ArrayList<Room>();
	
	public RoomDao() {
		
		roomlist.add(new Room(1, "ICU", "Vacant", 1000, "Kaushal"));
		roomlist.add(new Room(2, "General", "Occupied", 100, "Abhay"));
	}
	
	public String addroom(Room room, int id)
	{
		for (Room room1 : roomlist) {
			
			if (room1.getRoomId() == id) {
				return "already exists";
			}
		}
		roomlist.add(room);
		return "added";
	}
	
	public List<Room> getallrooms()
	{
		return roomlist;
	}
	
	public Room getroombyid(int id)
	{
		for (int i = 0; i < roomlist.size(); i++) {
			Room roomid = roomlist.get(i);
			if (roomid.getRoomId() == id) {
				return roomid;
			}
		}
		return null;
	}

	public String updateroombyid(int id, Room room)
	{
		for (int i = 0; i < roomlist.size(); i++) {
			Room roomid = roomlist.get(i);
			if (roomid.getRoomId()==id) {
				roomlist.set(i, room);
				return "updated";
			}
		}
		return "not updated";
	}

	public String deleteroomby(int id) {
		for (int i = 0; i < roomlist.size(); i++) {
			Room room = roomlist.get(i);
			if (room.getRoomId() == id) {
				roomlist.remove(room);
				return "deleted";
			}
		}
		return "not";
	}
	
	
}
