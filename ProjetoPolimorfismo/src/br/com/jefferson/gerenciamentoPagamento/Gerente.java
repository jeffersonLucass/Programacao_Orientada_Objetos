package br.com.jefferson.gerenciamentoPagamento;

public class Gerente extends Funcionario {
	private double bonusDeGerente;
	
	public Gerente(String nome, double salariobase, double bonusDeGerente) {
		super(nome, salariobase);
		this.bonusDeGerente = bonusDeGerente;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getBonusDeGerente() {
		return bonusDeGerente;
	}
	public void setBonusDeGerente(double bonusDeGerente) {
		this.bonusDeGerente = bonusDeGerente;
	}
	@Override
	public double calcularSalario() {
		 return getSalariobase() + getSalariobase() * bonusDeGerente;
	}
	
	
}
