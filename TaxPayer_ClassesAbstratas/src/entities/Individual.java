package entities;

public class Individual extends Imposto_a_Pagar{
	private Double gastosComSaude;
	
	public Individual(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	
	@Override
	public Double Imposto() {
		Double impostoFinal;
		
		if(rendaAnual < 20000) {
			return rendaAnual * 0.15 - gastosComSaude * 0.5;
		}
		return rendaAnual * 0.25 - gastosComSaude * 0.5;
	}
}
