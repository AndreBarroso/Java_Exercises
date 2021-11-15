package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController    //siguinifica que a classe é implementada por um controlador rest
@RequestMapping(value = "/users") //deve-se dar um nome para o recurso(value = "caminho do recurso)
public class UsersResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999", "123456");
		return ResponseEntity.ok().body(u);
	};
	
	

}
