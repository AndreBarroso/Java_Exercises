package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;
/* @Repository é opcional ja que a classe herda de JpaRepository
que já está registrado como componente expring */
public interface UserRepository extends JpaRepository<User, Long>{
}

// essa interface instancia um objeto respositries que tem várias operações

/* nesse caso em espercífico não precisa criar a implementação porque o spring jpa já tem uma implementação 
 padrão para essa interface */
