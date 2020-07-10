package com.javaspring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByUserName(String username);

}
//end class