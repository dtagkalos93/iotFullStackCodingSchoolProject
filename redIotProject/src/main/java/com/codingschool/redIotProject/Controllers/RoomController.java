package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Room;
import com.codingschool.redIotProject.Repositories.RoomRepository;
import com.codingschool.redIotProject.Services.RoomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    private RoomRepository repository;
    private RoomService roomService;

    public RoomController(RoomRepository repository, RoomService roomService) {
        this.repository = repository;
        this.roomService = roomService;
    }
}
