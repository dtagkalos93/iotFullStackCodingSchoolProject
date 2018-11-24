package com.codingschool.redIotProject.Services;


import org.springframework.stereotype.Service;

@Service
public class DeviceService  {

    private final DeviceService repository;


    public DeviceService(DeviceService repository) {
        this.repository = repository;
    }
}
