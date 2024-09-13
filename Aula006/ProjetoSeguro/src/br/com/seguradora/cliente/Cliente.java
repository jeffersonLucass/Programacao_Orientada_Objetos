package br.com.seguradora.cliente;

public class Cliente {
	private String nome;
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double contratarSeguro(int idade) {
		if(idade <= 25) {
			return 3000;
		}else {
			return 2000;
		}
	}
	
	
	
	
}
