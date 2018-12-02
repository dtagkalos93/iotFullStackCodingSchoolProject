package com.codingschool.redIotProject;

import com.codingschool.redIotProject.Entities.*;
import com.codingschool.redIotProject.Repositories.DeviceRepository;
import com.codingschool.redIotProject.Repositories.UserRepository;
import com.codingschool.redIotProject.Repositories.RoomRepository;
import com.codingschool.redIotProject.Repositories.DeviceTypeRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class RedIotProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedIotProjectApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init (UserRepository userRepository, DeviceRepository deviceRepository , RoomRepository roomRepository, DeviceTypeRepository devicetypeRepository ){
		return args -> {
			//PersonaRepository
			userRepository.save(new User("test1","Michael","Jordan","michael@jordan.com","123456","ADMIN"));
			userRepository.save(new User("test2","Kobe","Bryant","kobe@bryant.com","123456","USER"));
			userRepository.save(new User("test2","Lebron","James","lebron@james.com","123456","USER"));

			//RoomRepository
			Room l=new Room("Living Room");
			
			//DeviceTypeRepository
			DeviceType airco = new DeviceType("Aircondition");
			//Device d1 = new Device("Lionnel Messi",false,"",airco,l);
			
			
			//List<Device> devices = new ArrayList<>();
			//devices.add(d1);
			//airco.setDevices(devices);
			//l.setDevices(devices);
			
			
			DeviceType light = new DeviceType("Light");
			DeviceType tv = new DeviceType("Television");
			devicetypeRepository.save(airco);
			devicetypeRepository.save(light);
			devicetypeRepository.save(tv);
			
	
			Room k=new Room("Kitchen");
			Room b=new Room("Bedroom");
			roomRepository.save(l);
			roomRepository.save(k);
			roomRepository.save(b);

			//DeviceRepository
			
			Device d1 = new Device("Living Room TV",false,"",devicetypeRepository.findByTypeName("Television"),roomRepository.findByName("Living Room"));
			Device d2 = new Device("Kitchen Light",false,"",devicetypeRepository.findByTypeName("Light"),roomRepository.findByName("Kitchen"));
			Device d3 = new Device("Living Room Airco",false,"",devicetypeRepository.findByTypeName("Aircondition"),roomRepository.findByName("Living Room"));
			
			
			deviceRepository.save(d1);
			deviceRepository.save(d2);
			deviceRepository.save(d3);
			//deviceRepository.save(new Device("Lionnel Messi",false,"",devicetypeRepository.findByTypeName("Aircondition"),roomRepository.findByName("Living Room")));
			//deviceRepository.save(new Device("Cristiano Ronaldo",true,"",light,b));
			//deviceRepository.save(new Device("Dele Ali",true,"channel-CosmoteSports1,vol-15",tv,l));

			//Check if Everything store in h2 db
			userRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()+" "+ x.getSurname()+" " + x.getMail() +" " +x.getPassword()));
			deviceRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()+" "+ " " +x.getInformation() + " " + x.getDevicetype().getTypeName()));
			roomRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()));
			devicetypeRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getTypeName()));
			System.out.println(devicetypeRepository.findByTypeName("Aircondition").getTypeName());
			System.out.println(devicetypeRepository.findByTypeName("Aircondition").getId());
			System.out.println("device type of lionel messi: "+d1.getDevicetype().getTypeName());
		};



	}
}
