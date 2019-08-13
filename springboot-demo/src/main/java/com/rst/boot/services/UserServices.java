package com.rst.boot.services;

import java.util.List;

import com.rst.boot.domain.UserDTO;

public interface UserServices {
	
	List<UserDTO> findAllUsers();

	String saveUser(UserDTO userdata);

	String updateUser(UserDTO newUserData);

	UserDTO findById(Integer id);

	
}
