package entities;

public class  calculaGastos {
	protected int litros;
	protected double precoNacionalUnidade;
	
	public String tipoDeProduto = "gasolina";
	public String pais = "Brasil";
	private String primeiroNome;
	private String sobreNome;
	protected double totalAPagar ; 
	
	
	
	public calculaGastos(int litros, double precoNacionalUnidade, String primeiroNome, String sobreNome) {
		this.litros = litros;
		this.precoNacionalUnidade = precoNacionalUnidade;
		this.primeiroNome = primeiroNome;
		this.sobreNome = sobreNome;
	}



	public double valorPagar() {
		totalAPagar = litros * precoNacionalUnidade;
		return totalAPagar; 
	}
	
	public String recibo() {
		return primeiroNome + " " + sobreNome + " " + "pagou " + totalAPagar + " .";
	}
	
}
