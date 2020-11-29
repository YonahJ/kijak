package com.kijak.kijak.DAO;

import com.kijak.kijak.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerDao extends JpaRepository<Answer,Long> {

}
