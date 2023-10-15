package com.spring.register.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.register.entity.Members;

public interface UserRepository extends JpaRepository<Members, Long> {

	Optional<Members> findByusername(String username);
}
