package com.main.app.service;

import org.springframework.stereotype.Service;

import com.main.app.dto.UserRequestDTO;
import com.main.app.model.User;
import com.main.app.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
	
	private final UserRepository userRepository;
	
	public void createUser(UserRequestDTO userRequestDTO) {
		User user = User.builder()
				.username(userRequestDTO.getUsername())
				.password(userRequestDTO.getPassword())
				.email(userRequestDTO.getEmail())
				.build();
		userRepository.save(user);
		log.info("Product {} saved.", user.getId());
	}
	
}
