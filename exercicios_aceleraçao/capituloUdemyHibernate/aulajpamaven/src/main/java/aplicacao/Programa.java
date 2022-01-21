package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquin@gmail.com");
		Pessoa p3 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		// Carrega informações no BD
		/*
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		*/
		
		// Busca infromações no BD, via id
		 Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p); 
		System.out.println("Pronto"); 
		em.close();
		emf.close();
	}

}
