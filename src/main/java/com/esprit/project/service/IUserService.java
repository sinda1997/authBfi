package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.User;


public interface IUserService {

	List<User> retrieveAllUsers();
	User addUser(User u);
	void deleteUser(String id);
	User updateUser(User u);
	Optional<User> retrieveUser(String id);
}
