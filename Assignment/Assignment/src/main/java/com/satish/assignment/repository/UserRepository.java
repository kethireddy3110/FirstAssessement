package com.satish.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satish.assignment.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{	
}
