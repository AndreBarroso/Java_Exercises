package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;


/* para buscar o usuario no BD, essa classe tem de ter uma
 * dependencia para userRepository */

/* @Component resgistra a classe como componente do spring, para que possa ser injetada
 * em outras classes */
// para ficar semanticamente melhor que o acima, pode ser usado aqui @Service
@Service
public class UserService {
	
	@Autowired // para que o spring faça a injeção de dependencia
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
}
