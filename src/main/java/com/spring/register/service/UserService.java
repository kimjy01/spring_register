package com.spring.register.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.register.entity.Members;
import com.spring.register.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public Members create(String username, String email, String password) {
		
		Members member = new Members();
		member.setUsername(username);
		member.setEmail(email);
		member.setPassword(passwordEncoder.encode(password));
		this.userRepository.save(member);
		
		return member;
	}
}
