package application;


import entities.calculaGastos;
import entities.gastoEmMinas;

public class Principal {

	public static void main(String[] args) {
		int litros = 5;
		double valorPorLitro = 2;
		String primeiroNome = "Joao";
		String sobreNome = "Silva";
		
		
		calculaGastos resposta = new calculaGastos(litros, valorPorLitro, primeiroNome, sobreNome);
		
		resposta.valorPagar();
		
		System.out.println(resposta.recibo());
		
		
		gastoEmMinas meuGasto = new gastoEmMinas(litros, valorPorLitro, primeiroNome, sobreNome);
		
		meuGasto.valorPagar();
		
		System.out.println(meuGasto.recibo());
		
		
	}

}