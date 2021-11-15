package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController    //siguinifica que a classe é implementada por um controlador rest
@RequestMapping(value = "/users") //deve-se dar um nome para o recurso(value = "caminho do recurso)
public class UsersResource {
	
	@GetMapping //indica que o método responde a uma requisição GET
	public ResponseEntity<User> findAll(){ // esse método é um endpoint que acessa usuarios
		User u = new User(1L, "Maria", "maria@gmail.com", "99999", "123456");
		return ResponseEntity.ok().body(u);
	};
}
