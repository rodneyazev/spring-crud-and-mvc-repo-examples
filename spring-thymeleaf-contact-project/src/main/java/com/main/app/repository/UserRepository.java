package com.main.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
