package com.kijak.kijak.DAO;

import com.kijak.kijak.entity.Choice;
import com.kijak.kijak.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
}
