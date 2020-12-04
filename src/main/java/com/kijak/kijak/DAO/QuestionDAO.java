package com.kijak.kijak.DAO;

import com.kijak.kijak.entity.Choice;
import com.kijak.kijak.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Long> {
}
