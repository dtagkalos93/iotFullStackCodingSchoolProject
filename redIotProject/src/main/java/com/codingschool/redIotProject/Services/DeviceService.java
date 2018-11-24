package com.codingschool.redIotProject.Services;


import com.codingschool.redIotProject.Repositories.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService  {

    private final DeviceRepository repository;


    public DeviceService(DeviceRepository repository) {
        this.repository = repository;
    }
}
