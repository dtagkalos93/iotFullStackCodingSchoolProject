package com.codingschool.redIotProject;

import com.codingschool.redIotProject.Entities.*;
import com.codingschool.redIotProject.Repositories.DeviceRepository;
import com.codingschool.redIotProject.Repositories.PersonRepository;
import com.codingschool.redIotProject.Repositories.RoomRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class RedIotProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedIotProjectApplication.class, args);
	}

	@Bean
	ApplicationRunner init (PersonRepository personRepository ,DeviceRepository deviceRepository , RoomRepository roomRepository){
		return args -> {
			//PersonaRepository
			personRepository.save(new Person ("Michael","Jordan","michael@jordan.com","123456",new Role("Admin").toString()));
			personRepository.save(new Person ("Kobe","Bryant","kobe@bryant.com","123456",new Role("User").toString()));
			personRepository.save(new Person ("Lebron","James","lebron@james.com","123456",new Role("User").toString()));

			//DeviceRepository
			deviceRepository.save(new Device("Lionnel Messi",false,"",new DeviceType("Aircondition").toString()));
			deviceRepository.save(new Device("Cristiano Ronaldo",true,"",new DeviceType("Lamp").toString()));
			deviceRepository.save(new Device("Dele Ali",true,"channel-CosmoteSports1,vol-15",new DeviceType("Television").toString()));

			//DeviceRepository
			roomRepository.save(new Room("Living Room"));
			roomRepository.save(new Room("Kitchen"));
			roomRepository.save(new Room("Bedroom"));


			//Check if Everything store in h2 db
			personRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()+" "+ x.getSurname()+" " + x.getMail() +" " +x.getPassword() + " " + x.getRole().toString()));
			deviceRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()+" "+ " " +x.getInformation() + " " + x.getType().toString()));
			roomRepository.findAll().forEach(x->System.out.println(x.getName()));
		};



	}
}
