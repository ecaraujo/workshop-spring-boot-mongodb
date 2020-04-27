package com.araujo.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.araujo.workshopmongo.domain.User;
import com.araujo.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@hotmail.com");
		User alex = new User(null, "Alex Green", "alex@hotmail.com");
		User bob = new User(null, "Bob Grey", "bob@hotmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
		
	}
	
	
}
