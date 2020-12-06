package com.kijak.kijak.service.facade;

import java.util.List;
import java.util.Optional;

import com.kijak.kijak.bean.Answer;
import com.kijak.kijak.bean.Choice;

public interface ChoiceService {
    public Choice save(Choice choice);
    public Optional<Choice> findbyid(Long id);
    public List<Choice> findall();
    public int delete (Choice choice);
}
