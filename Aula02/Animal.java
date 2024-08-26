package br.com.jefferson.animal;

public class Animal {
	private String cor;
	private int idade;
	private String especie;
	
	
	public Animal(String cor, int idade, String especie) {
		super();
		this.cor = cor;
		this.idade = idade;
		this.especie = especie;
	}
	
	
	public void rugir() {
		if(this.especie == "cachorro") {
			System.out.println("AU AU");
		}
		else if(this.especie =="gato"){
			System.out.println("Miauuu");
		}else {
			System.out.println("AUUUUUUU");
		}
	}
	
	public void exibirDados() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Idade: "+this.idade);
		System.out.println("Especie: "+this.especie);
	}
}
