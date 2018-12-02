package com.codingschool.redIotProject;

import com.codingschool.redIotProject.Entities.*;
import com.codingschool.redIotProject.Repositories.DeviceRepository;
import com.codingschool.redIotProject.Repositories.UserRepository;
import com.codingschool.redIotProject.Repositories.RoomRepository;
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
	ApplicationRunner init (UserRepository userRepository, DeviceRepository deviceRepository , RoomRepository roomRepository){
		return args -> {
			//PersonaRepository
			userRepository.save(new User("test1","Michael","Jordan","michael@jordan.com","123456","ADMIN"));
			userRepository.save(new User("test2","Kobe","Bryant","kobe@bryant.com","123456","USER"));
			userRepository.save(new User("test2","Lebron","James","lebron@james.com","123456","USER"));

			//DeviceRepository
			deviceRepository.save(new Device("Lionnel Messi",false,"","Aircondition"));
			deviceRepository.save(new Device("Cristiano Ronaldo",true,"","Lamp"));
			deviceRepository.save(new Device("Dele Ali",true,"channel-CosmoteSports1,vol-15","Television" ));

			//RoomRepository
			/*roomRepository.save(new Room("Living Room"));
			roomRepository.save(new Room("Kitchen"));
			roomRepository.save(new Room("Bedroom"));*/


			//Check if Everything store in h2 db
			userRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()+" "+ x.getSurname()+" " + x.getMail() +" " +x.getPassword()));
			deviceRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()+" "+ " " +x.getInformation() + " " + x.getDevicetype().getTypeName()));
			//roomRepository.findAll().forEach(x->System.out.println(x.getId()+" :: "+x.getName()));
		};



	}
}
