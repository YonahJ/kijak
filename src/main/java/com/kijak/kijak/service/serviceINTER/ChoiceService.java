package com.kijak.kijak.service.serviceINTER;

import com.kijak.kijak.entity.Answer;
import com.kijak.kijak.entity.Choice;

import java.util.List;
import java.util.Optional;

public interface ChoiceService {
    public Choice save(Choice choice);
    public Optional<Choice> findbyid(Long id);
    public List<Choice> findall();
    public int delete (Choice choice);
}
