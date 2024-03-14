package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.controller.UserController;
import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	private UserRepository userRepository; 


	public UserServiceImp(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	



	
}
