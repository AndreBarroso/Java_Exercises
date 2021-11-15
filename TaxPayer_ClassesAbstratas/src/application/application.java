package application;

import java.util.ArrayList;
import java.util.List;

import entities.Compania;
import entities.Imposto_a_Pagar;
import entities.Individual;

public class application {

	public static void main(String[] args) {
		List<Imposto_a_Pagar> imposto = new ArrayList<>();

		imposto.add(new Individual("Alex", 50000.00, 2000.00));
		imposto.add(new Compania("SoftTech", 400000.00, 25));
		imposto.add(new Individual("Bob", 120000.00, 1000.00));
		
		for(Imposto_a_Pagar imp: imposto) {
			System.out.println(imp.getNome() +  " " + imp.Imposto());
		}
	}

}
