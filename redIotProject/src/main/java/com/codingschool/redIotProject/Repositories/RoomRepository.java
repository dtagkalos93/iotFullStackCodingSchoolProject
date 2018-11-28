package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.Room;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
	
	List<Room> findAll();
	Room findByname (String name);
	Room findByid (long id);
}
