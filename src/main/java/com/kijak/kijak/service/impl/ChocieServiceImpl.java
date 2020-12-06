package com.kijak.kijak.service.impl;

import com.kijak.kijak.bean.Answer;
import com.kijak.kijak.bean.Choice;
import com.kijak.kijak.dao.ChoiceDao;
import com.kijak.kijak.service.facade.ChoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChocieServiceImpl implements ChoiceService {
    @Autowired
    public ChoiceDao choiceDAO;

    @Override
    public Choice save(Choice choice) {
        return choiceDAO.save(choice);
    }

    @Override
    public Optional<Choice> findbyid(Long id) {
        return choiceDAO.findById(id);
    }

    @Override
    public List<Choice> findall() {
        return choiceDAO.findAll();
    }

    @Override
    public int delete(Choice choice) {
        choiceDAO.delete(choice);
        return 1;
    }
}
