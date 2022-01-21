package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;
import com.example.course.services.UserService;

@RestController    //siguinifica que a classe é implementada por um controlador rest
@RequestMapping(value = "/users") //deve-se dar um nome para o recurso(value = "caminho do recurso)
public class UsersResource {
	
	// faz a classe controler ter dependencia para o service
	@Autowired  // para que o spring faça a injeção de dependencia
	private UserService service; //
	
	@GetMapping //indica que o método responde a uma requisição GET
	public ResponseEntity<List> findAll(){ // esse método é um endpoint que acessa usuarios
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	};
	
	@GetMapping(value = "/{id}") //indica que o método responde a uma requisição GET
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	};
}
