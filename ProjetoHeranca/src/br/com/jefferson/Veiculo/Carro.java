package br.com.jefferson.Veiculo;

public class Carro extends Veiculo{

	private int QuantidadeDePortas;
	
	public Carro(String marca, int ano, String modelo,int QuantidadeDePortas) {
		super(marca, ano, modelo);
		this.QuantidadeDePortas = QuantidadeDePortas;
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Quantidade de portas: "+QuantidadeDePortas);
		
	}
	
}
