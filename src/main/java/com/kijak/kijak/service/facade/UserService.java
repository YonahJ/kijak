package com.kijak.kijak.service.facade;

import java.util.List;
import java.util.Optional;

import com.kijak.kijak.bean.User;

public interface UserService {
    public int save(User user);
    public Optional<User> findById(Long id);
    public List<User> findAll();
    public int delete (User user);
    public User findByUsername(String username);
	public User findByEmail(String email);
	public int deleteByEmail(String email);
	int seConnecter(User user);
}
