package com.kijak.kijak.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kijak.kijak.bean.User;
import com.kijak.kijak.service.facade.UserService;

@RestController
@RequestMapping("kijak-api/User")
public class UserRest {
	@Autowired
	UserService userService;
	
	@PostMapping
	public int save(User user) {
    	return userService.save(user);
    }

    @GetMapping
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @DeleteMapping
    public int delete(@RequestBody User user) {
       return userService.delete(user);
       
    }

	@GetMapping("/username/{username}")
	public User findByUsername(@PathVariable String username) {
		return userService.findByUsername(username);
	}

	@GetMapping("/email/{email}")
	public User findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}

	@DeleteMapping("/email/{email}")
	public int deleteByEmail(@PathVariable String email) {
		return  userService.deleteByEmail(email);
	}
	
	@PutMapping
	public int seConnecter(@RequestBody User user) {
		return userService.seConnecter(user);
	}
}
