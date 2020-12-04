package com.kijak.kijak.service.serviceIMPL;

import com.kijak.kijak.DAO.QuestionDAO;
import com.kijak.kijak.entity.Question;
import com.kijak.kijak.service.serviceINTER.QuestionSEVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionSERVICEimpl implements QuestionSEVICE {
    @Autowired
    private QuestionDAO questionDAO;
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
