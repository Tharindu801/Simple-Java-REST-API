package com.rst.boot.services.impl;


import com.rst.boot.domain.UserDTO;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserDTO> findAllUsers() {
		
		List<UserDTO> allusers= userRepository.findAll();
		return allusers;
	}

	@Override
	public String saveUser(UserDTO userdata) {
		// TODO Auto-generated method stub
		userRepository.save(userdata);
		return "Data saved";
	}

	@Override
	public String updateUser(UserDTO newUserData) {
		
		String msg = null;
		
		if (newUserData.getId() != null) {
			userRepository.save(newUserData);
			msg = "Data updated";
		}else {
			msg = "Error";
		}
		return msg;
	}

	@Override
	public UserDTO findById(Integer id) {
		
		return userRepository.findOne(id);
		
	}

}
