package com.kijak.kijak.service.impl;

import com.kijak.kijak.bean.User;
import com.kijak.kijak.dao.UserDao;
import com.kijak.kijak.service.facade.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
       @Autowired
       private UserDao userDAO;
    @Override
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    public Optional<User> findbyid(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findall() {
        return userDAO.findAll();
    }

    @Override
    public int delete(User user) {
        userDAO.delete(user);
        return 0;
    }
}
