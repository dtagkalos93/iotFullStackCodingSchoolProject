package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Room;
import com.codingschool.redIotProject.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
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

	@GetMapping
	public List<Room> findAll(){
		return roomService.findAll();
	}

	@GetMapping("/{id}")
	public Room findOne(@PathVariable long id) {
		return roomService.findById(id);
	}




}