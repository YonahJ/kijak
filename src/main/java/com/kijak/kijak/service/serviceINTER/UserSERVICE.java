package com.kijak.kijak.service.serviceINTER;

import com.kijak.kijak.entity.Choice;
import com.kijak.kijak.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserSERVICE {
    public User save(User user);
    public Optional<User> findbyid(Long id);
    public List<User> findall();
    public int delete (User user);
}
