package com.rst.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.domain.UserDTO;
import com.rst.boot.services.UserServices;

@RestController
@RequestMapping("/user")
public class User {
	
	@Autowired
	private UserServices userservices;
	
	@GetMapping("/all")
	public List<UserDTO> allUsers() {
		return userservices.findAllUsers();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserDTO Userdata) {
		return userservices.saveUser(Userdata);
	}
	
	@PutMapping("/update")
	public String UpdateUser(@RequestBody UserDTO newUserData) {
		return userservices.updateUser(newUserData);
	}
	
	@GetMapping("/find/{id}")
	public UserDTO getUserById(@PathVariable Integer id) {
		return userservices.findById(id);
	}
}
