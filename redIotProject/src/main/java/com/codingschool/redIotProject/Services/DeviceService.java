package com.codingschool.redIotProject.Services;


import com.codingschool.redIotProject.Entities.Device;
import com.codingschool.redIotProject.Repositories.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeviceService {
    List<Device> findByName(String name);
    List<Device> findAll();
    List<Device> findByNameContaining(String searchterm);
    Device findById(long id);
    Device save(Device d);

}
