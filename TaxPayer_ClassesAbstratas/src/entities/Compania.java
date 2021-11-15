package entities;

public class Compania extends Imposto_a_Pagar{
	private Integer numeroEmpregados;
	
	
	public Compania(String nome, Double rendaAnual, Integer numeroEmpregados) {
		super(nome, rendaAnual);
		this.numeroEmpregados = numeroEmpregados;
	}


	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}


	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}
	
	@Override
	public Double Imposto() {
		if(numeroEmpregados > 14) {
			return rendaAnual * 0.14;
		}
		return rendaAnual * 0.16;
	}

	
	
}
