package com.kijak.kijak.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kijak.kijak.bean.User;
import com.kijak.kijak.dao.UserDao;
import com.kijak.kijak.service.facade.UserService;
import com.kijak.kijak.service.util.HashUtil;


@Service
public class UserServiceImpl implements UserService {
       @Autowired
       private UserDao userDAO;
    @Override
    public int save(User user) {
    	User foundUser = findByEmail(user.getEmail());
    	user.setPassword(HashUtil.hash(user.getPassword()));
    	if(foundUser!=null) {
    		return -1;
    	} else {
    		userDAO.save(user);
    		return 1;
    	}
    }

    @Override
    public Optional<User> findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public int delete(User user) {
        userDAO.delete(user);
        return 0;
    }

	@Override
	public User findByUsername(String username) {
		return userDAO.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return userDAO.findByEmail(email);
	}

	@Override
	public int deleteByEmail(String email) {
		int deleted = userDAO.deleteByEmail(email);
		return deleted;
	}
	
	@Override
    public int seConnecter(User user) {
        User loadedUser = findByEmail(user.getEmail());
        if (loadedUser == null) {
            return -1;
        } else if (!loadedUser.getPassword().equalsIgnoreCase(HashUtil.hash(user.getPassword()))) {
            loadedUser.setNbrTentatifRestant(loadedUser.getNbrTentatifRestant() - 1);
            if (loadedUser.getNbrTentatifRestant() == 0) {
                loadedUser.setBloqued(true);
                loadedUser.setDateBloquage(new Date());
                userDAO.save(loadedUser);
                return -2;
            } else {
                userDAO.save(loadedUser);
                return -3;
            }
        } else {
            return 1;
        }
    }
	
	@Override
	public User update(String username, String email, String password) {
		User foundedUser = findByUsername(username);
		foundedUser.setUsername(username);
		foundedUser.setPassword(password);
		foundedUser.setPassword(HashUtil.hash(foundedUser.getPassword()));
		foundedUser.setNbrTentatifRestant(5);
		User updatedUser = userDAO.save(foundedUser);

		return updatedUser;
	}
}
