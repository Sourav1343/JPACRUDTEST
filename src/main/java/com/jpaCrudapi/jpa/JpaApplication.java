package com.jpaCrudapi.jpa;

import com.jpaCrudapi.jpa.entity.User;
import com.jpaCrudapi.jpa.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		log.info("Main Method Started");
		ApplicationContext context =SpringApplication.run(JpaApplication.class, args);

		log.info("Create repo object");

		UserRepository userRepository = context.getBean(UserRepository.class);
		log.info("Create User object");
		User user = new User();
		log.info("Set User object");
		user.setName("Sourav");
		log.info("Set repo object");
		User user1 = userRepository.save(user);
	}

}
