//PACOTE
package br.com.honda.veiculo;

public class Veiculo {
	//ATRIBUTOS DA CLASSE
	private String marca;
	private String modelo;
	private String cor;
	
	
	//CONSTRUTOR DA CLASSE (INICIALIZAR OS ATRIBUTOS)
	public Veiculo(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	
	//METODO
	public void acelerar() {
		System.out.println(modelo+ " Acelerando");
	}
	//METODO
	public void freiar() {
		System.out.println(modelo+" freiando");
	}
	
}
