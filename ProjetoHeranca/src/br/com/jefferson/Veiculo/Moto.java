package br.com.jefferson.Veiculo;

public class Moto extends Veiculo {
	private boolean temPartidaEletrica;
	public Moto(String marca, int ano, String modelo,boolean temPartidaEletrica) {
		super(marca, ano, modelo);
		this.temPartidaEletrica = temPartidaEletrica;
	}
	@Override
	public void exibirInformacoes() {
		// TODO Auto-generated method stub
		super.exibirInformacoes();
		System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
	}
	
}
