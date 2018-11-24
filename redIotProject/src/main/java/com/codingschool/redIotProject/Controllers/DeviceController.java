package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Device;
import com.codingschool.redIotProject.Repositories.DeviceRepository;
import com.codingschool.redIotProject.Services.DeviceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class DeviceController {
    private DeviceRepository repository;
    private DeviceService deviceService;

    public DeviceController(DeviceRepository repository, DeviceService deviceService) {
        this.repository = repository;
        this.deviceService = deviceService;
    }


}
