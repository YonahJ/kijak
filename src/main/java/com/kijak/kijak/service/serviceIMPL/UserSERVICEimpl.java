package com.kijak.kijak.service.serviceIMPL;

import com.kijak.kijak.DAO.UserDAO;
import com.kijak.kijak.entity.User;
import com.kijak.kijak.service.serviceINTER.UserSERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSERVICEimpl implements UserSERVICE {
       @Autowired
       private UserDAO userDAO;
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
