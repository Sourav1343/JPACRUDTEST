package com.jpaCrudapi.jpa;

import com.jpaCrudapi.jpa.entity.User;
import com.jpaCrudapi.jpa.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@Slf4j
@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		log.info("Main Method Started");
		ApplicationContext context =SpringApplication.run(JpaApplication.class, args);

		log.info("Create repo object");

		UserRepository userRepository = context.getBean(UserRepository.class);
		log.info("Create User object");
		User user1 = new User();
		log.info("Set User object");
		user1.setName("Sourav");
		user1.setCity("Nuh");
		user1.setStatus("Live");

		User user2 = new User();
		log.info("Set User object");
		user2.setName("Sourav");
		user2.setCity("Nuh");
		user2.setStatus("Live");
		log.info("Set repo object");
		List<User> Users =List.of(user1,user2);
		userRepository.saveAll(Users);


	}

}
