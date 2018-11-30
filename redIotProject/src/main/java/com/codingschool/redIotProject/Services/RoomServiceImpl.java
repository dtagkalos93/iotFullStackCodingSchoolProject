package com.codingschool.redIotProject.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingschool.redIotProject.Entities.Room;
import com.codingschool.redIotProject.Repositories.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepository roomRep;
	
	@Override
    public List<Room> findAll() {
    	return roomRep.findAll();
    }
	
	@Override
	public Room findByname (String name) {
		return roomRep.findByname(name);
	}
	
	@Override
	public Room findByid (long id) {
		return roomRep.findByid(id);
	}
}
