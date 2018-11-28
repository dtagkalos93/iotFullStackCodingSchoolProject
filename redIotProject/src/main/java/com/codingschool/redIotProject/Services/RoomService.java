package com.codingschool.redIotProject.Services;

import com.codingschool.redIotProject.Entities.Room;
import java.util.List;


public interface RoomService {
	List<Room> findAll();
	Room findByname (String name);
	Room findByid (long id);
	
}
