package entities;

public abstract class Imposto_a_Pagar {
	private String nome;
	protected Double rendaAnual;
	protected Double imposto;
	
	protected Double encargoFinal;
	
	
	
	
	
	public Imposto_a_Pagar(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public Double Imposto() {
		return getRendaAnual();
	}
	
	
}
