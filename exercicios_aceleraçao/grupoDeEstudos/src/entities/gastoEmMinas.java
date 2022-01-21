package entities;

public class gastoEmMinas extends calculaGastos{
	private double imposto = 0.4;
	
	public gastoEmMinas(int litros, double precoNacionalUnidade, String primeiroNome, String sobreNome) {
		super(litros, precoNacionalUnidade, primeiroNome, sobreNome);
	}
	
	@Override
	public double valorPagar() {
		totalAPagar = litros * precoNacionalUnidade + imposto*(litros * precoNacionalUnidade);
		return totalAPagar; 
	}
		

}
