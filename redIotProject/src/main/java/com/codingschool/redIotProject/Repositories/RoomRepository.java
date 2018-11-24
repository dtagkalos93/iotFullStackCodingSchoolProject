package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room,Long> {
}
