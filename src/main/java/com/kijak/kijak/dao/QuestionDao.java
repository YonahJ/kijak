package com.kijak.kijak.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kijak.kijak.bean.Choice;
import com.kijak.kijak.bean.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {
}
