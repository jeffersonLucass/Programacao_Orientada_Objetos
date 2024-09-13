package br.com.calculoimc.geral;

public class Atleta extends Pessoa {
	
	private String esportePraticado;
	
	public Atleta(String nome, double peso, double altura) {
		super(nome, peso, altura);
		this.esportePraticado = esportePraticado;
	}

	@Override
	public double calculoIMC() {
		// TODO Auto-generated method stub
		double valorBase = super.calculoIMC();
		return valorBase *0.95;
	}
	
	
	
	
	
}
