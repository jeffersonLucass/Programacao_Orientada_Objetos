package br.com.jefferson.gerenciamentoPagamento;

public class Diretor extends Funcionario {
	private double bonusDoDiretor;
	public Diretor(String nome, double salariobase,double bonusDoDiretor) {
		super(nome, salariobase);
		// TODO Auto-generated constructor stub
		this.bonusDoDiretor = bonusDoDiretor;
	}
	public double getBonusDoDiretor() {
		return bonusDoDiretor;
	}
	public void setBonusDoDiretor(double bonusDoDiretor) {
		this.bonusDoDiretor = bonusDoDiretor;
	}
	@Override
	public double calcularSalario() {
		return getSalariobase() + getSalariobase()*bonusDoDiretor;
	}
	
	
	

}
