package br.com.honda.veiculo;

public class Carro extends Veiculo{
	private int tamanhoPortaLuvas;
	private int QtdTapete;
	
	
	
	public Carro(String marca, String modelo, String cor, int portaLuvas, int qtdTapete) {
		super(marca, modelo, cor);
		this.tamanhoPortaLuvas = portaLuvas;
		QtdTapete = qtdTapete;
	}



	public void capota() {
		
		System.out.println("Capotando");
	}
}
