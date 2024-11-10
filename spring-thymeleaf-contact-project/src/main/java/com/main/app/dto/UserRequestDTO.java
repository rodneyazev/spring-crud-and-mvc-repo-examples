package com.main.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
	
	@NotBlank(message = "Username is mandatory.")
	private String username;
	
	@NotBlank(message = "Password is mandatory.")
	private String password;
	
	@NotBlank(message = "Email is mandatory.")
	private String email;
	
	private String phone_number;
	
}
