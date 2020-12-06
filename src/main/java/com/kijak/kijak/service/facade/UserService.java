package com.kijak.kijak.service.facade;

import java.util.List;
import java.util.Optional;

import com.kijak.kijak.bean.Choice;
import com.kijak.kijak.bean.User;

public interface UserService {
    public User save(User user);
    public Optional<User> findbyid(Long id);
    public List<User> findall();
    public int delete (User user);
}
