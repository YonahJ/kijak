package com.kijak.kijak.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kijak.kijak.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	public User findByUsername(String username);
	public User findByEmail(String email);
	public int deleteByEmail(String email);
}
