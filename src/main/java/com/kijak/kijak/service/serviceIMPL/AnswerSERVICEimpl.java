package com.kijak.kijak.service.serviceIMPL;

import com.kijak.kijak.DAO.AnswerDao;
import com.kijak.kijak.entity.Answer;
import com.kijak.kijak.service.serviceINTER.AnswerSERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerSERVICEimpl implements AnswerSERVICE {
    @Autowired
    private AnswerDao answerDao;
    @Override
    public Answer save(Answer answer) {
        return answerDao.save(answer);
    }

    @Override
    public Optional<Answer> findbyid(Long id) {
        return answerDao.findById(id);
    }

    @Override
    public List<Answer> findall() {
        return answerDao.findAll();
    }

    @Override
    public int delete(Answer answer) {
        answerDao.delete(answer);
        return 1;
    }
}
