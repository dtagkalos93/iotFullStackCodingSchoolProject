package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeviceRepository extends CrudRepository<Device,Long> {
}
