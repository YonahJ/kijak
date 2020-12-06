package com.kijak.kijak.service.facade;

import java.util.List;
import java.util.Optional;

import com.kijak.kijak.bean.Departement;
import com.kijak.kijak.bean.Question;

public interface QuestionService {
    public Question save(Question question);
    public Optional<Question> findbyid(Long id);
    public List<Question> findall();
    public int delete(Question question);
}
