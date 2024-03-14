package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController
{   @Autowired
	private UserRepository userRepository;


	
	@RequestMapping("/")
	public String userPage()
	{
		
		return "user";
		
	}

	@RequestMapping("/saveData")
	@ResponseBody
	public String saveData( UserInfo user)
	{
		userRepository.save(user);
		return "redirect:/getdata";
	}
	
	
	
	@GetMapping("/user")
	public String showUser(Model model)
	{
		List<UserInfo> user=userRepository.findAll();
		model.addAttribute("user",user);
		return "getdata";
		
	}
	
	

}
