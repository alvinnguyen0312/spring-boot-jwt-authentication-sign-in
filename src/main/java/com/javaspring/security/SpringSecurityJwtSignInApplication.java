package com.javaspring.security;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.javaspring.security.entity.User;
import com.javaspring.security.repository.UserRepository;


@SpringBootApplication
public class SpringSecurityJwtSignInApplication {
  @Autowired
	private UserRepository repository;
	
  @PostConstruct //initialize these data
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "alvin", "password", "alvin@gmail.com"),
				new User(102, "user1", "password1","user1@gmail.com"),
				new User(103, "user2", "password2","user2@gmail.com"),
				new User(104, "user3", "password3","user3@gmail.com")
				).collect(Collectors.toList());
		repository.saveAll(users);
		}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtSignInApplication.class, args);
	}

}
