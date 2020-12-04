package com.kijak.kijak.service.serviceINTER;

import com.kijak.kijak.entity.Answer;

import java.util.List;
import java.util.Optional;

public interface AnswerSERVICE {
    public Answer save(Answer answer);
    public Optional<Answer> findbyid(Long id);
    public List<Answer> findall();
    public int delete (Answer answer);
}
