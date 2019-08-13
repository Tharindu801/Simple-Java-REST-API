package com.rst.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.boot.domain.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Integer>{

}
