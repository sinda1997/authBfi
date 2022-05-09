package com.esprit.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.project.entity.User;
import com.esprit.project.service.IUserService;

@RestController
public class UserController {

	@Autowired 
	IUserService userService;
	
	
	// http://localhost:8082/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@PreAuthorize("hasRole('ADMIN')")
	@ResponseBody
	public List<User> getUsers() {
	List<User> list = userService.retrieveAllUsers();
	return list;
	}
	
	// http://localhost:8082/retrieve-user/{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	@PreAuthorize("hasRole('ADMIN')")
	@ResponseBody
	public Optional<User> retrieveUser(@PathVariable("user-id") String userId) {
	return userService.retrieveUser(userId);
	}
	
	// http://localhost:8082/add-user
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u) {
	User user = userService.addUser(u);
	return user;
	}
	
	// http://localhost:8082/remove-user/{user-id}
	@DeleteMapping("/remove-user/{user-id}")
	@PreAuthorize("hasRole('ADMIN')")
	@ResponseBody
	public void removeUser(@PathVariable("user-id") String userId) {
	userService.deleteUser(userId);
	}
	
	// http://localhost:8082/modify-user
	@PutMapping("/modify-user")
	@PreAuthorize("hasRole('ADMIN')")
	@ResponseBody
	public User modifyUser(@RequestBody User user) {
	return userService.updateUser(user);
	}
	
	/*/ http://localhost:8081/SpringMVC/servlet/retrive-user-jpql/{d1}/{d2}
	@GetMapping("/retrive-user-jpql/{d1}/{d2}")
	@ResponseBody
	public List<User> retrieveUserbybirthdate(@PathVariable("d1") String d1,@PathVariable("d2") String d2) throws ParseException {
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(d1);  
	Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(d2);
	return userService.retrieveUsersByBirthDate(date1, date2);
	}
	
	// http://localhost:8081/SpringMVC/servlet/retrive-user-sql/{date1}/{date2}
	@GetMapping("retrive-user-sql/{date1}/{date2}")
	@ResponseBody
	public List<User> retrieveUserbybirthdateSql(@PathVariable("date1") String d1,@PathVariable("date2") String d2) throws ParseException {
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(d1);  
	Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(d2);
	return userService.retrieveUsersByBirthDatesql(date1, date2);
	}
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-user-role/{role}
	@GetMapping("/retrieve-user-role/{role}")
	@ResponseBody
	public List<User> retrieveUserbybirthdateRole(@PathVariable("role") Role role) {
	return userService.retrieveUsersByRole(role);
		}*/
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-accounts
}
