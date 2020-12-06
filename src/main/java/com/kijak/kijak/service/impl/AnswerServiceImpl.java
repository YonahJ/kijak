package com.kijak.kijak.service.impl;

import com.kijak.kijak.bean.Answer;
import com.kijak.kijak.dao.AnswerDao;
import com.kijak.kijak.service.facade.AnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerDao answerDao;
    
    @Override
    public int save(Answer answer) {
        Answer foundAnswer = answerDao.findByReference(answer.getReference());
        if(foundAnswer!=null) {
        	return -1;
        } else {
        	answerDao.save(answer);
        	return 1;
        }
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

    @Override
	public int deleteByReference(String reference) {
		return answerDao.deleteByReference(reference);
	}

    @Override
	public Answer findByReference(String reference) {
		return answerDao.findByReference(reference);
	}
}
