package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Device;
import com.codingschool.redIotProject.Repositories.DeviceRepository;
import com.codingschool.redIotProject.Services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public List<Device> findAll(){
        return deviceService.findAll();
    }

    @GetMapping("/{id}")
    public Device findOne(@PathVariable long id) {
        return deviceService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Device create(@RequestBody Device d) {
        return deviceService.save(d);
    }
    
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Device changeStatus(@RequestBody Device d, @PathVariable Long id) {
        return deviceService.changeStatus(d, id);
    }
    

}
