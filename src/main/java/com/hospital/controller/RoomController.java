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
import com.hospital.model.Room;
import com.hospital.service.RoomService;

@RestController
public class RoomController {
	
	@Autowired
	RoomService roomservice;
	
	@PostMapping("api/room/{id}")
	public String addroom(@RequestBody Room room, @PathVariable("id") int id )
	{
		return roomservice.addroom(room, id);
	}
	
	@GetMapping("api/room")
	public List<Room> getallrooms()
	{
		return roomservice.getallrooms();

	}
	
	@GetMapping("api/room/{id}")
	public Room getroombyid(@PathVariable("id") int id)
	{
		return roomservice.getroombyid(id);
	}
	
	@PutMapping("api/room/{id}")
	public String updateroombyid(@PathVariable("id") int id, @RequestBody Room room)
	{
		return roomservice.updateroombyid(id, room);
	}
	
	@DeleteMapping("api/room/{id}")
	public String deleteroomby(@PathVariable("id") int id)
	{
		return roomservice.deleteroomby(id);
	}

}
