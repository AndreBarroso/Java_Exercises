package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Configuration // fala pro spring que é uma classe específica de configuração
@Profile("test") // fala que é uma configuração específica para o ambiente de teste
public class TestConfig implements CommandLineRunner {
	// commandLineRunner executa esse essa classe quando o programa for iniciado

	/*
	 * injeção de dependencia. Essa classe tem de ter uma dependencia para a
	 * interface userRepository. A dependeica deve ser fraca(desacoplada)
	 */
//o framework tem um mecanismo de injeção de dependência implicito
	@Autowired // resolve a dependendica e associa a instancia do userRepository no test config
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// esse médodo foi criado junto com a CommandLineRunner
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//salva a lista de objetos no banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));

	}
}

//essa classe serve para fazer o database seeding

// para salvar os dados, a classe que faz isso é o repository
