package com.kijak.kijak.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kijak.kijak.bean.Choice;

@Repository
public interface ChoiceDao extends JpaRepository<Choice, Long> {
}
