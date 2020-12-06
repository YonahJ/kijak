package com.kijak.kijak.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kijak.kijak.bean.Answer;

@Repository
public interface AnswerDao extends JpaRepository<Answer,Long> {
	public Answer findByReference(String reference);
	public int deleteByReference(String reference);
}
