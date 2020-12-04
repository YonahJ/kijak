package com.kijak.kijak.service.serviceINTER;

import com.kijak.kijak.entity.Departement;
import com.kijak.kijak.entity.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionSEVICE {
    public Question save(Question question);
    public Optional<Question> findbyid(Long id);
    public List<Question> findall();
    public int delete(Question question);
}
