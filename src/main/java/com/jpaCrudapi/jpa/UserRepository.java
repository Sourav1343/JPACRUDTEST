package com.jpaCrudapi.jpa;

import com.jpaCrudapi.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}