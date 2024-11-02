package br.com.jefferson.Veiculo;

public class Caminhao extends Veiculo{
	private double capacidade;
	
	public Caminhao(String marca, int ano, String modelo, double capacidade) {
		super(marca, ano, modelo);
		this.capacidade = capacidade;
	}

	@Override
	public void exibirInformacoes() {
		// TODO Auto-generated method stub
		super.exibirInformacoes();
		System.out.println("Capacidade de carga: " + capacidade + " toneladas");
	}

	
}
