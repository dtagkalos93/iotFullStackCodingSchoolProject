package com.codingschool.redIotProject.Services;

import com.codingschool.redIotProject.Repositories.RoomRepository;
import org.springframework.stereotype.Service;


@Service
public class RoomService {


    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }


}
