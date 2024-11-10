package com.main.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.main.app.dto.UserRequestDTO;
import com.main.app.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody UserRequestDTO userRequestDTO) {
		userService.createUser(userRequestDTO);
	}
}
