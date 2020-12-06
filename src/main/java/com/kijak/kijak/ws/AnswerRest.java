package com.kijak.kijak.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kijak.kijak.bean.Answer;
import com.kijak.kijak.service.facade.AnswerService;

@RestController
@RequestMapping("kijak-api/Answer")
public class AnswerRest {
	@Autowired
	public AnswerService answerService; 
	 @Override
	    public int save(Answer answer) {
	        return answerService.save(answer);
	    }

	    @Override
	    public Optional<Answer> findbyid(Long id) {
	        return answerService.findById(id);
	    }

	    @Override
	    public List<Answer> findall() {
	        return answerService.findAll();
	    }

	    @Override
	    public int delete(Answer answer) {
	    	answerService.delete(answer);
	    }

	    @Override
		public int deleteByReference(String reference) {
			return answerService.deleteByReference(reference);
		}

	    @Override
		public Answer findByReference(String reference) {
			return answerService.findByReference(reference);
		}		
}
