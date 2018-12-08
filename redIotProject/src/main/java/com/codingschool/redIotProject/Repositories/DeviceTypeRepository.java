package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceType,Long> {
	
	DeviceType findByTypeName(String typeName);

}
