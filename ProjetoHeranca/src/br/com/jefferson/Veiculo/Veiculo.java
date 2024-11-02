package br.com.jefferson.Veiculo;

public class Veiculo {
	
	private String marca;
	private int ano;
	private String modelo;
	
	
	public Veiculo(String marca, int ano, String modelo) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
	}
	
	public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }


}
