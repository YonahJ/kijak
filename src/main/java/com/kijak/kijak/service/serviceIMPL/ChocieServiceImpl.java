package com.kijak.kijak.service.serviceIMPL;

import com.kijak.kijak.DAO.ChoiceDAO;
import com.kijak.kijak.entity.Answer;
import com.kijak.kijak.entity.Choice;
import com.kijak.kijak.service.serviceINTER.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChocieServiceImpl implements ChoiceService {
    @Autowired
    public ChoiceDAO choiceDAO;

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
