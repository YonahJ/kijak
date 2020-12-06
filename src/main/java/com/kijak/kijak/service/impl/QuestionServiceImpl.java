package com.kijak.kijak.service.impl;

import com.kijak.kijak.bean.Question;
import com.kijak.kijak.dao.QuestionDao;
import com.kijak.kijak.service.facade.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDAO;
    @Override
    public Question save(Question question) {
        return questionDAO.save(question);
    }

    @Override
    public Optional<Question> findbyid(Long id) {
        return questionDAO.findById(id);
    }

    @Override
    public List<Question> findall() {
        return questionDAO.findAll();
    }

    @Override
    public int delete(Question question) {
        questionDAO.delete(question);
        return 0;
    }
}
