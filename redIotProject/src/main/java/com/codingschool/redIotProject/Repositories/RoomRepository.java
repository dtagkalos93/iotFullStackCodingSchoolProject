package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

	List<Room> findAll();
	Room findByName (String name);
	Room findById (long id);
//	void deleteById(long id);
}