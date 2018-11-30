package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Room;
import com.codingschool.redIotProject.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

	/*
    private RoomRepository repository;
    private RoomService roomService;

    public RoomController(RoomRepository repository, RoomService roomService) {
        this.repository = repository;
        this.roomService = roomService;
    }*/
	@Autowired
    private RoomService roomService;
	
	@RequestMapping("/room/")
	public Room getRoomById (@RequestParam(value="id", defaultValue = "1") long id) {
		return roomService.findByid(id);
	}
	
}
