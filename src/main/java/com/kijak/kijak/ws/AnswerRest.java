package com.kijak.kijak.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kijak.kijak.bean.Answer;
import com.kijak.kijak.service.facade.AnswerService;

@RestController
@RequestMapping("kijak-api/Answer")
public class AnswerRest {
	@Autowired
	public AnswerService answerService; 
	 	
	@PostMapping
	public int save(@RequestBody Answer answer) {
		return answerService.save(answer);
	}

	@GetMapping("/id/{id}")
	public Optional<Answer> findById(@PathVariable Long id) {
		return answerService.findById(id);
	}
	
	@GetMapping("/")
	public List<Answer> findAll() {
		return answerService.findAll();
	}

	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return answerService.deleteByReference(reference);
	}
	    
	@GetMapping("/reference/{reference}")
	public Answer findByReference(@PathVariable String reference) {
		return answerService.findByReference(reference);
	}
}
